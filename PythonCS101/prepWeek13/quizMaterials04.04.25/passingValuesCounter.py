import sys

def counter(num):
    if num < 5:
        print("number needs to be greater than 5")
        sys.exit
    for cnt in range(5, num + 1):
        print(cnt)

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

counter(int(sys.argv[1]))

# Pass 1 Arguments from the Command Line.