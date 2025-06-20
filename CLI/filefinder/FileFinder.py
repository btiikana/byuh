import os
import tkinter as tk
from tkinter import filedialog, messagebox
import subprocess
import platform

def searchFiles():
    queryName = entryQueryName.get().strip()
    if not queryName:
        messagebox.showerror("Error", "Please enter a file or folder name.")
        return

    startDir = entryDirectory.get().strip() or "/"
    if not os.path.exists(startDir):
        messagebox.showerror("Error", "Invalid directory.")
        return

    resultsList.delete(0, tk.END)
    filePaths.clear()
    foundFirst = False

    for root, dirs, files in os.walk(startDir):
        # Check if file matches query
        if searchType.get() == "File":
            for file in files:
                if queryName.lower() == file.lower():
                    fullPath = os.path.join(root, file)
                    resultsList.insert(tk.END, fullPath)
                    filePaths.append(fullPath)

                    if not foundFirst:
                        openContainingFolder(fullPath)
                        foundFirst = True
            if foundFirst:
                break  # Stop searching after the first exact match for file

        # Check if directory matches query
        elif searchType.get() == "Folder":
            for dir in dirs:
                if queryName.lower() == dir.lower():
                    fullPath = os.path.join(root, dir)
                    resultsList.insert(tk.END, fullPath)
                    filePaths.append(fullPath)

                    if not foundFirst:
                        openContainingFolder(fullPath)
                        foundFirst = True
            if foundFirst:
                break  # Stop searching after the first exact match for folder

    if not filePaths:
        resultsList.insert(tk.END, "No exact match found.")

def chooseDirectory():
    selectedDir = filedialog.askdirectory()
    if selectedDir:
        entryDirectory.delete(0, tk.END)
        entryDirectory.insert(0, selectedDir)

def openFolder(event):
    selection = resultsList.curselection()
    if not selection:
        return
    filePath = resultsList.get(selection[0])
    if os.path.isdir(filePath):
        openContainingFolder(filePath)
    
    # Save the selected file/folder path in history
    history.append(filePath)
    historyIndex = len(history) - 1
    entryQueryName.delete(0, tk.END)
    entryQueryName.insert(0, filePath)  # Display the selected path in the text box

def openContainingFolder(filePath):
    folderPath = os.path.dirname(filePath)
    systemName = platform.system()
    try:
        if systemName == "Windows":
            os.startfile(folderPath)
        elif systemName == "Darwin":  # macOS
            subprocess.run(["open", folderPath])
        else:  # Linux
            subprocess.run(["xdg-open", folderPath])
    except Exception as e:
        messagebox.showerror("Error", f"Failed to open folder:\n{e}")

# Implement Up arrow key functionality to recall previous file/folder paths
def onUpArrow(event):
    global historyIndex
    if historyIndex > 0:
        historyIndex -= 1
        entryQueryName.delete(0, tk.END)
        entryQueryName.insert(0, history[historyIndex])

def onDownArrow(event):
    global historyIndex
    if historyIndex < len(history) - 1:
        historyIndex += 1
        entryQueryName.delete(0, tk.END)
        entryQueryName.insert(0, history[historyIndex])

# GUI setup
root = tk.Tk()
root.title("File and Folder Finder")

filePaths = []
history = []  # List to hold previous file paths
historyIndex = -1  # Pointer to the current index in history

tk.Label(root, text="File/Folder name:").grid(row=0, column=0, sticky="w")
entryQueryName = tk.Entry(root, width=40)
entryQueryName.grid(row=0, column=1, padx=5, pady=5)

tk.Label(root, text="Start directory:").grid(row=1, column=0, sticky="w")
entryDirectory = tk.Entry(root, width=40)
entryDirectory.grid(row=1, column=1, padx=5, pady=5)
tk.Button(root, text="Browse...", command=chooseDirectory).grid(row=1, column=2)

tk.Label(root, text="Search for:").grid(row=2, column=0, sticky="w")
searchType = tk.StringVar(value="File")
tk.Radiobutton(root, text="File", variable=searchType, value="File").grid(row=2, column=1, sticky="w")
tk.Radiobutton(root, text="Folder", variable=searchType, value="Folder").grid(row=2, column=2, sticky="w")

tk.Button(root, text="Search", command=searchFiles).grid(row=3, column=1, pady=10)

resultsList = tk.Listbox(root, width=80, height=20)
resultsList.grid(row=4, column=0, columnspan=3, padx=10, pady=10)
resultsList.bind("<Double-Button-1>", openFolder)

# Bind Up and Down arrow keys for navigating the history
entryQueryName.bind("<Up>", onUpArrow)
entryQueryName.bind("<Down>", onDownArrow)

root.mainloop()
