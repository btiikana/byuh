# Practice: Make two functions and store the functions inside a list variable then iterate through the list so that you can call both functions in one call out.


# Correct initialization of list
numbers_list = list(range(1, 11))  # List of numbers from 1 to 10
sumOfNumbers = 0

# Function to get numbers and print them
def getNumbers():
    for num in numbers_list:
        print(num, end = " ")
    print(f"\nLength of the list: {len(numbers_list)}")
    print(f"Number at index 5: {numbers_list[5]}")  # Index 5 is valid here

# Function to add numbers and print the sum
def addNumbers():
    global sumOfNumbers
    for num in numbers_list:
        sumOfNumbers += num
    print(f"Sum of all the numbers: {sumOfNumbers}")

# Store the functions in a list
allFunctions = [getNumbers, addNumbers]

# Call both functions in a loop
for func in allFunctions:
    func()

#------------------------------------------------------------------------------

# Call two function using just one caller at the end.
numbers = list(range(1,50))

def addAllNumbers():
    sumOfAllNumbers = 0
    for num in numbers:
        sumOfAllNumbers += num
    print(f"New Function: {sumOfAllNumbers}")
addAllNumbers()

def displayNumbers():
    for num in numbers_list:
        print(num, end = " ")
    print(f"\nLength of the list: {len(numbers_list)}")
    print(f"Number at index 5: {numbers_list[5]}")  # Index 5 is valid here

twoFunctions = [addAllNumbers, displayNumbers]

for function in twoFunctions:
    function()

