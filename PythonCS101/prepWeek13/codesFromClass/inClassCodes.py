import sys

# (Quiz Material)Original Codes for creating an hollowed Square.
def squareHollow(char, num):
    spacing = " " * (num - 2)
    print(char * num)
    for _ in range (num - 2):
        print(char + spacing + char)
    print(char * num)

if len (sys.argv) == 1:
    print("missing args!")
    sys.exit

#squareHollow(sys.argv[1], int(sys.argv[2]))

# (Quiz Material)Optimized Codes for creating an hollowed Square.
def squaredHollow(char, num):
    for row in range(num):
        if row == 0 or row == num -1:
            print(char * num)
        else:
            print(char + " " * (num - 2) + char)

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

#squaredHollow(sys.argv[1], int(sys.argv[2]))

#------------------------------------------------------------------------------------

# (Quiz Material)How to draw a BOX and Print its Total Area!
def drawBox(letter, width, height):
    for row in range(0, height):
        print(letter * width)
    return width * height

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

#area = drawBox(sys.argv[1], int(sys.argv[2]), int(sys.argv[3]))
#print(f"This box has an area of {area}")

#------------------------------------------------------------------------------------

# Counting every digit from a number passed from the command line.
def counter(num):
    if num < 5:
        print("number needs to be greater than 5")
        sys.exit
    for cnt in range(5, num + 1):
        print(cnt)

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

#counter(int(sys.argv[1]))

#------------------------------------------------------------------------------------

# (Home Work Material) How to create a Pyramid.
def Pyramid(char, num):
    for row in range(num, 0, -1):
        spaces = " " * (num - row)
        characters = char * (2 * row - 1)
        print(spaces + characters)

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

#Pyramid(sys.argv[1], int(sys.argv[2]))

#------------------------------------------------------------------------------------
# (Home Work Material) How to create an INVERTED Pyramid.
def invertedPyramid(char, num):
    for row in range(num, 0, -1):
        spaces = " " * (num - row)
        characters = char * (2 * row - 1)
        print(spaces + characters)

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

#invertedPyramid(sys.argv[1], int(sys.argv[2]))

#------------------------------------------------------------------------------------

# (Home Work Material) Finding Occurences.
def findOccurence(word, match):
    cnt = 0
    for char in word:
        if char.lower() in match.lower():
            cnt = cnt + 1
    print(f"There's {cnt} occurence of {match} in '{word}'")

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

# Find how many "e" are in a word
#findOccurence(sys.argv[1], sys.argv[2])

# (Home Work Material) Removing Occurences.
def removeOccurence(word, match):
    print(f" Letter '{match}' has been removed from the word '{word.lower().replace(match.lower(), "")}'")

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

removeOccurence(sys.argv[1], sys.argv[2])
#------------------------------------------------------------------------------------