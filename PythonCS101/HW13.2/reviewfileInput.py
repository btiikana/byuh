# Name: Betero Tiikana
# Course: CS101
# Homework: 13.2

lineCount = []
vowels = "aeiou"
consonants = "bcdfghjklmnpqrstvwxyz"


def countLines(fileName):
    with open(fileName, "r") as txtFile:
        for line in txtFile:
            line = line[:-1]
            lineCount.append(line)
        print(f"There are {len(lineCount)} lines in file: '{file}'")

def countCharacters(fileName):
    with open(fileName, "r") as txtFile:
        txtFile = txtFile.read()
        print(f"There are {len(txtFile)} in file: '{file}'")
        
def countVowelsAndConsonants(fileName):
    vowelsCount = 0
    consonantsCount = 0

    with open(fileName, "r") as txtFile:
        txtFile = txtFile.read().lower()
        for char in txtFile:
            if char in vowels:
                vowelsCount += 1
            elif char in consonants:
                consonantsCount += 1
        print(f"There are {vowelsCount} vowels in file: '{file}'")
        print(f"There are {consonantsCount} consonants in file: '{file}'")

def countLowerCaseAndUpperCase(fileName):
    lowerCount = 0
    upperCount = 0

    with open(fileName, "r") as txtFile:
        txtFile = txtFile.read()

    for char in txtFile:
        if char == char.lower() and char != char.upper():
            lowerCount += 1
        elif char == char.upper() and char != char.lower():
            upperCount += 1
    
    print(f"There are {lowerCount} lowercased  letters in file: '{file}'")
    print(f"There are {upperCount} uppercased letters in file: '{file}'")


# file = "input1.txt"
# file = "input2.txt"
file = "input3.txt"

countLines(file)
countCharacters(file)
countVowelsAndConsonants(file)
countLowerCaseAndUpperCase(file)
