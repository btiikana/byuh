import sys

def squareHollow(char, num):
    spacing = " " * (num - 2)
    print(char * num)
    for _ in range (num - 2):
        print(char + spacing + char)
    print(char * num)

if len (sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

squareHollow(sys.argv[1], int(sys.argv[2]))

# Pass 2 Arguments from the Command Line.