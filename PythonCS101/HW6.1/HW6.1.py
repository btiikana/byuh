# Name: Betero Tiikana
# Course: CS101

# Task 1
# Ask the user to input 10 integers , store the numbers as a list,(be sure to cast the input as an int before appending to the list) and then returns the sum of all 10 integers. (see rubric 6.1.1)
def getTotal():
    numList = []
    number = 20
    while number != -1:
        number = int(input("Enter a number between 1 and 50, do this 10 times (Enter -1 to quit) "))
        numList.append(number)
    numList.pop()
    for total in range(len(numList)):
        total = sum(numList)
    print(f"Total Number: {total}")


# Task 2
# Add a function that finds the max number among the 10 intergers input by the user. (see rubric 6.1.2)
def getMax():
    numList = []
    number = 20
    while number != -1:
        number = int(input("Enter a number between 1 and 50, do this 10 times (Enter -1 to quit) "))
        numList.append(number)
    numList.pop()
    for largest in range(len(numList)):
        largest = max(numList)
    print(f"The largest number is: {largest}")

# Task 3
# Add a function that calculates the mean of the 10 integers input by the user. (see rubric 6.1.3)
def getMean():
    numList = []
    number = 20
    while number != -1:
        number = int(input("Enter a number between 1 and 50, do this 10 times (Enter -1 to quit) "))
        numList.append(number)
    numList.pop()
    for average in range(len(numList)):
        average = int(sum(numList) / len(numList))
    print(f"The Total of All The Numbers is: {average}")

# getTotal()
# getMax()
getMean()