import sys

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

# Pass 2 Arguments from the Command Line.