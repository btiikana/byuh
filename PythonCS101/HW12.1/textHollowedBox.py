# Name: Betero Tiikana
# Course: CS101

import sys

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