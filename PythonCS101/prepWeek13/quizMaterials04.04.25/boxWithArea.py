import sys

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