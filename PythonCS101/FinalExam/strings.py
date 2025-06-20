import sys


# Command Line Inputs
# Hollowed Box:
def textHollowedBox(text, size):
    spacing = " " * (size-2)
    print("Hollowed Box:")
    print(text * size)
    for count in range(size-2):
        print(text + spacing + text)
    print(text * size)

if len(sys.argv)<3:
    print("You need to add a letter and integer after the program name to complete the box.")
else:
    textHollowedBox(sys.argv[1], int(sys.argv[2]))


# FilledBox(Not Hollowed):
def fillBoxWithText(letter, size):
    textBetween = letter * (size-2)
    print(letter * size)
    for idx in range(size-2):
        print(letter + textBetween + letter)
    print(letter * size)

if len(sys.argv)<3:
    print("Command Line Arguments are missing!!")
else:
    fillBoxWithText(sys.argv[1], int(sys.argv[2]))

# Box With Area:
def boxWithArea(letter, width, height):
    for row in range(0, height):
        print(letter * width)
    return width * height

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

area = boxWithArea(sys.argv[1], int(sys.argv[2]), int(sys.argv[3]))
print(f"This box has an area of {area}")
# Pass 3 Arguments(File name, 2nd, 3rd and 4th argument) from the Command Line.


# Regular Pyramid:
def Pyramid(char, num):
    totalCharacters = 0
    for row in range(0, num + 1):
        spaces = " " * (num - row)
        characters = char * (2 * row - 1)
        print(spaces + characters)
        totalCharacters += 2 * row - 1
    print(f"There are {totalCharacters} {char}'s inside the Pyramid")

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit()

Pyramid(sys.argv[1], int(sys.argv[2]))
# Pass 2 Arguments from the Command Line.


# Inverted Pyramid:
def invertedPyramid(char, num):
    totalCharacters = 0
    for row in range(num, 0, -1):
        spaces = " " * (num - row)
        characters = char * (2 * row - 1)
        print(spaces + characters)
        totalCharacters += 2 * row - 1
    print(f"There are {totalCharacters} {char}'s inside the Pyramid")

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

invertedPyramid(sys.argv[1], int(sys.argv[2]))
# Pass 2 Arguments from the Command Line.

# Find and Remove Occurances
import sys

def findOccurence(word, match):
    cnt = 0
    for char in word:
        if char.lower() in match.lower():
            cnt = cnt + 1
    print(f"There's {cnt} occurence of {match} in '{word}'")

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

# Find how many "e" are in a word
findOccurence(sys.argv[1], sys.argv[2])

# (Home Work Material) Removing Occurences.
def removeOccurence(word, match):
    print(f" Letter '{match}' has been removed from the word '{word.lower().replace(match.lower(), "")}'")

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

removeOccurence(sys.argv[1], sys.argv[2])
# Pass 2 Arguments from the Command Line.

# ----------------------------------------------------------------------------------------------------------------

# String Manipulation
# Counting the type of characters in a sentence.
    # char, vowels, consonants, lowercase, uppercase.

# Characters
def countChars(sentence):
    charCounter = 0
    # Replace Space with "" to count no Spaces
    # for char in sentence.replace(" ", ""):
    # Count everything even with Spaces
    for char in sentence:
        charCounter += 1
    print(f"There are {charCounter} characters in {sentence}")
        
# Vowels
def countVowels(sentence):
    vowelCounter = 0
    for char in sentence:
        if char.lower() in "aeiou":
            vowelCounter += 1
    print(f"There are {vowelCounter} vowels in {sentence}")
    
# Consonants
def countConsonants(sentence):
    consonantCounter = 0
    for char in sentence.replace(" ", ""):
        if char.lower() not in "aeiou":
            consonantCounter += 1
    print(f"There are {consonantCounter} consonants in {sentence}")
    
# Lowercase
def countLowercase(sentence):
    lowercaseCounter = 0
    for char in sentence.replace(" ", ""):
        if char.islower():
            lowercaseCounter += 1
    print(f"There are {lowercaseCounter} lowercase in {sentence}")
    
# Uppercase
def countLowercase(sentence):
    uppercaseCounter = 0
    for char in sentence.replace(" ", ""):
        if char.islower():
            uppercaseCounter += 1
    print(f"There are {uppercaseCounter} lowercase in {sentence}")

sentence = sys.argv[1]
countChars(sentence) 
countVowels(sentence)
countConsonants(sentence)
countLowercase(sentence)
countLowercase(sentence)