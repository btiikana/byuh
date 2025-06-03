import sys

import sys

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
