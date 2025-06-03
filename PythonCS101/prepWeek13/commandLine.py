# Name: Betero Tiikana
# Course: CS101

import sys
argv = sys.argv
def textHollowedBox(text, number):
    spacing = " "*(number-2)
    
    print(f"\nHollowed box:\n{" " * number}\n{text * number}")
    for count in range(number-2):
        print(text + spacing + text)
    print(text * number)

if len(argv)<3:
    print("You need to add a letter and integer after the program name to complete the box.")
else:
    textHollowedBox(argv[1], int(argv[2]))

def textBox(letter, integer):
    textBetween = letter * (integer-2)
    print(f"\nBox Filled w/ Text:\n {" " * integer}\n{letter * integer}")
    for idx in range(integer-2):
        print(letter + textBetween + letter)
    print(letter * integer)

if len(argv)<3:
    print("You need to add a letter and integer after the program name to complete the box.")
else:
    textBox(argv[1], int(argv[2]))