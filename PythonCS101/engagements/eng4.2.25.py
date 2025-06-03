import sys

def pyramid(char, num):
    for row in range(1, num + 1):
        spaces = " " * (num - row)
        characters = char * (2 * row - 1)
        print(spaces + characters)

if len(sys.argv) == 1:
    print("missing arguments in the command line!")
    sys.exit()

pyramid(sys.argv[1], int(sys.argv[2]))