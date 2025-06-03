# def writeFile(writeToFile):
#     with open("myfile.txt", "w") as file:
#         file.write(writeToFile)

# def overWrite(overWriteFile):
#     with open("myfile.txt", "w") as newFile:
#         newFile.write(overWriteFile)


# content = """\
# Hello world,
# My name is Tione.
# """

# newContent = """\
# Hello world,
# My name is Destiny.
# """

# writeFile(content)
# overWrite(newContent)

myContent = """\
Hello World,
My name is Betero,
Today I will teach you how to write,
read and save files.
"""

def createContent(content):
    with open("txt.txt", "w") as create:
        create.write(content)

def overWriteAndChangeName(fileName):
    with open(fileName, "r") as file:
        newContent = file.read()
    newContent = newContent.replace(",", "")
    with open(fileName, "w") as file:
        file.write(newContent)

def saveToNewFile(oldFileName, newFileName):
    with open(oldFileName, "r") as oldFile:
        readOldFile = oldFile.read()
    
    with open(newFileName, "w") as newFile:
        newFile.write(readOldFile)

file = "txt.txt"
oldFileName = file
newFile = "new.txt"
createContent(myContent)
overWriteAndChangeName(file)
saveToNewFile(oldFileName, newFile)

