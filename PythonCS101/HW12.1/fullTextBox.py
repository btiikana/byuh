# Name: Betero Tiikana
# Course: CS101

import sys

def textBox(letter, size):
    textBetween = letter * (size-2)
    print(letter * size)
    for idx in range(size-2):
        print(letter + textBetween + letter)
    print(letter * size)

if len(sys.argv)<3:
    print("You need to add a letter and integer after the program name to complete the box.")
else:
    textBox(sys.argv[1], int(sys.argv[2]))