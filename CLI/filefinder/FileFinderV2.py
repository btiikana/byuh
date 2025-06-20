import sys
import os
import subprocess
import platform
from PyQt5.QtWidgets import (
    QApplication, QWidget, QLabel, QLineEdit, QPushButton,
    QFileDialog, QListWidget, QMessageBox, QVBoxLayout, QHBoxLayout,
    QFrame, QStackedLayout
)
from PyQt5.QtCore import Qt

class FileFinder(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Modern File & Folder Finder")
        self.setStyleSheet(self.loadStyles())
        self.setMinimumSize(750, 550)

        self.filePaths = []
        self.history = []
        self.historyIndex = -1
        self.search_mode = "File"

        self.setupUI()

    def setupUI(self):
        mainLayout = QVBoxLayout(self)
        mainLayout.setContentsMargins(30, 30, 30, 30)
        mainLayout.setSpacing(20)

        # File/Folder Name Input
        queryFrame = QFrame()
        queryLayout = QVBoxLayout(queryFrame)
        queryLayout.addWidget(QLabel("File or Folder Name:"))
        self.entryQueryName = QLineEdit()
        queryLayout.addWidget(self.entryQueryName)
        mainLayout.addWidget(queryFrame)

        # Start Directory Input
        dirFrame = QFrame()
        dirLayout = QHBoxLayout(dirFrame)
        dirLayout.addWidget(QLabel("Start Directory:"))
        self.entryDirectory = QLineEdit()
        browseButton = QPushButton("Browse")
        browseButton.clicked.connect(self.chooseDirectory)
        dirLayout.addWidget(self.entryDirectory)
        dirLayout.addWidget(browseButton)
        mainLayout.addWidget(dirFrame)

        # Toggle Buttons for File/Folder Mode
        toggleFrame = QFrame()
        toggleLayout = QHBoxLayout(toggleFrame)
        toggleLayout.setSpacing(10)

        self.btnFile = QPushButton("Search File")
        self.btnFolder = QPushButton("Search Folder")

        for btn in (self.btnFile, self.btnFolder):
            btn.setCheckable(True)
            btn.setCursor(Qt.PointingHandCursor)

        self.btnFile.setChecked(True)
        self.btnFile.clicked.connect(lambda: self.setMode("File"))
        self.btnFolder.clicked.connect(lambda: self.setMode("Folder"))

        toggleLayout.addWidget(self.btnFile)
        toggleLayout.addWidget(self.btnFolder)
        mainLayout.addWidget(toggleFrame)

        # Search Button
        searchButton = QPushButton("Search")
        searchButton.clicked.connect(self.searchFiles)
        mainLayout.addWidget(searchButton)

        # Results List
        self.resultsList = QListWidget()
        self.resultsList.itemDoubleClicked.connect(self.openFolder)
        mainLayout.addWidget(self.resultsList)

        self.entryQueryName.installEventFilter(self)

    def setMode(self, mode):
        self.search_mode = mode
        self.btnFile.setChecked(mode == "File")
        self.btnFolder.setChecked(mode == "Folder")

    def chooseDirectory(self):
        selectedDir = QFileDialog.getExistingDirectory(self, "Select Directory")
        if selectedDir:
            self.entryDirectory.setText(selectedDir)

    def searchFiles(self):
        queryName = self.entryQueryName.text().strip()
        if not queryName:
            QMessageBox.critical(self, "Error", "Please enter a file or folder name.")
            return

        startDir = self.entryDirectory.text().strip() or "/"
        if not os.path.exists(startDir):
            QMessageBox.critical(self, "Error", "Invalid directory.")
            return

        self.resultsList.clear()
        self.filePaths.clear()
        foundFirst = False

        for root, dirs, files in os.walk(startDir):
            if self.search_mode == "File":
                for file in files:
                    if queryName.lower() == file.lower():
                        fullPath = os.path.join(root, file)
                        self.resultsList.addItem(fullPath)
                        self.filePaths.append(fullPath)
                        if not foundFirst:
                            self.openContainingFolder(fullPath)
                            foundFirst = True
                if foundFirst:
                    break
            else:
                for dir in dirs:
                    if queryName.lower() == dir.lower():
                        fullPath = os.path.join(root, dir)
                        self.resultsList.addItem(fullPath)
                        self.filePaths.append(fullPath)
                        if not foundFirst:
                            self.openContainingFolder(fullPath)
                            foundFirst = True
                if foundFirst:
                    break

        if not self.filePaths:
            self.resultsList.addItem("No exact match found.")

    def openFolder(self, item):
        filePath = item.text()
        if os.path.isdir(filePath):
            self.openContainingFolder(filePath)

        self.history.append(filePath)
        self.historyIndex = len(self.history) - 1
        self.entryQueryName.setText(filePath)

    def openContainingFolder(self, filePath):
        folderPath = os.path.dirname(filePath)
        systemName = platform.system()
        try:
            if systemName == "Windows":
                os.startfile(folderPath)
            elif systemName == "Darwin":
                subprocess.run(["open", folderPath])
            else:
                subprocess.run(["xdg-open", folderPath])
        except Exception as e:
            QMessageBox.critical(self, "Error", f"Failed to open folder:\n{e}")

    def eventFilter(self, source, event):
        if source is self.entryQueryName and event.type() == event.KeyPress:
            if event.key() == Qt.Key_Up and self.historyIndex > 0:
                self.historyIndex -= 1
                self.entryQueryName.setText(self.history[self.historyIndex])
            elif event.key() == Qt.Key_Down and self.historyIndex < len(self.history) - 1:
                self.historyIndex += 1
                self.entryQueryName.setText(self.history[self.historyIndex])
        return super().eventFilter(source, event)

    def loadStyles(self):
        return """
        QWidget {
            background-color: #121212;
            color: #ffffff;
            font-family: 'Segoe UI', sans-serif;
            font-size: 14px;
        }

        QLineEdit, QListWidget {
            background-color: #1e1e1e;
            border: 1px solid #3a3a3a;
            border-radius: 6px;
            padding: 6px;
        }

        QPushButton {
            background-color: #2a2a2a;
            border: 1px solid #444;
            padding: 8px 14px;
            border-radius: 8px;
        }

        QPushButton:hover {
            background-color: #3e3e3e;
        }

        QPushButton:checked {
            background-color: #0078d7;
            border: 1px solid #0078d7;
            color: white;
        }

        QLabel {
            font-weight: bold;
            margin-bottom: 4px;
        }

        QListWidget {
            border: 1px solid #3a3a3a;
        }

        QScrollBar:vertical {
            background: #1e1e1e;
            width: 12px;
            margin: 16px 0 16px 0;
        }
        """

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = FileFinder()
    window.show()
    sys.exit(app.exec_())
