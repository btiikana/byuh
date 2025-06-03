# Name: Betero Tiikana
# Course: CS101
# Home Work: 12.2

import sys

#----------------------------------------------------------------------------------
# 13.1)
def invertedPyramid(char, num):
    for row in range(num, 0, -1):
        spaces = " " * (num - row)
        characters = char * (2 * row - 1)
        print(spaces + characters)

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

#invertedPyramid(sys.argv[1], int(sys.argv[2]))


#----------------------------------------------------------------------------------
# 13.2)
def findOccurence(word, match):
    cnt = 0
    for char in word:
        if char.lower() in match.lower():
            cnt = cnt + 1
    print(f"There's {cnt} occurence of {match} in '{word}'")

if len(sys.argv) == 1:
    #print("missing args!")
    sys.exit

#findOccurence(sys.argv[1], sys.argv[2])


#----------------------------------------------------------------------------------
# 13.3)
def removeOccurence(word, match):
    print(f" Letter '{match}' has been removed from the word '{word.lower().replace(match.lower(), "")}'")
    return word, match

if len(sys.argv) == 1:
    print("missing args!")
    sys.exit

removeOccurence(sys.argv[1], sys.argv[2])