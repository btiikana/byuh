def addLists():
    numbers = [4, 9, 3, 5, 8, 19]
    for number in numbers:
        ans = number + 10
        print(f"{"Answer = "} {ans}")

addLists()

def chooseNumbers(index):
    numbers = [19, 3, 2, 67]
    print(f"{"Answer ="} {numbers [index]}")

chooseNumbers(2)
chooseNumbers(0)
chooseNumbers(3)

def showNumbers(index):
    numbers = [10, 100, 100, 10000]
    print(f"{"Your answer is:"} {numbers[index]}")

showNumbers(0)
showNumbers(3)
showNumbers(2)
showNumbers(1)

def printNumbers():
    numbers = list(range(255))
    print(f"{"These are the numbers from 0 to 255"} {numbers}")
printNumbers()
