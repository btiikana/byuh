# STRINGS!!!!

# Change the string to uppercase.
string = "string"
capitalized = string.upper()
print(capitalized)

# Replace a word in the quote with another word.
quote = "Hello"
replace = quote.replace("Hello", "Aloha")
print(replace)

# Extract a substring from the middle of the string.
stringsToExtract = "Hello World"
extractedStrings = stringsToExtract [5:]
print(extractedStrings)

# Print the length of the string.
stringsToPrint = "Aloha World"
lengthOfString = len(stringsToPrint)
print(lengthOfString)

# Check if the string contains the word "Python".
stringsToCheck = "Python is amazing"
if "Python" in stringsToCheck:
    print("Python is found")
else:
    print("No Python found!")


# INTEGERS!!!
# Create an integer variable and perform the following operations:
integer = 140

# Add 10 to it.
integer = integer + 10
print(integer)

# Subtract 5 from it
subInteger = integer - 5
print(subInteger)

# Multiply it by 2
multiInteger = integer * 2
print(multiInteger)

# Divide it by 4 and return the quotient and remainder.
divideInteger = float(integer // 4)
print(divideInteger)

# Check if the number is even or odd.
checkValue = integer % 2 == 0
if checkValue is True:
    print("The number is even")
else:
    print("The number is odd")

# LISTS!!!
# Create a list of your 5 favourite colors. Perform the following operations:
myFavouriteColors = ["Black", "Blue", "Gray", "Tan", "White"]

# Add new color to the list.
newColor = "Orange"
myFavouriteColors.append(newColor)
print(myFavouriteColors)

# Remove the second color in the list.
myFavouriteColors.remove(myFavouriteColors[1])
print(myFavouriteColors)

# Acess the third color.
myFavouriteColors = myFavouriteColors[:1] + ["Blue"] + myFavouriteColors[1:]
thirdIndex = myFavouriteColors[1]
print(thirdIndex)

# Sort the list alphabetically.
myFavouriteColors = sorted(myFavouriteColors)
print(myFavouriteColors)

# Find the index of a color in the list.
print("Look for the index of Blue")
colorIndex = myFavouriteColors.index("Blue")
if "Blue" in myFavouriteColors:
    print("Blue is in the list")
else:
    print("Blue is not in the list")
print(f"The index location for Blue is at: Index {colorIndex}")

# TUPLES!!!
# Create a tuple containing your three favourite numbers. Perform the following:
myTuple = (1, 2, 3)

# Access the second item in the tuple.
secondIndex = myTuple.index(1)
accessSecondItem = myTuple[1]
if accessSecondItem == 2:
    print(f"Index {secondIndex} is accessed and this index stores this number: {accessSecondItem}")
else:
    print()

# Concatenate the tuple with another tuple of two numbers.
firstTuple = (0, 1)
secondTuple = (2, 3)
newTuple = tuple(firstTuple + secondTuple)
print(newTuple)

# Try to change one value in the tuple (and observe what happens).
def modifyValue():
    removedValue = newTuple[:2] + newTuple[3:]
    print(removedValue)
modifyValue()

# SETS!!!
# Create a set containing 5 random numbers. Perform the following:
numberSet = {3, 4, 5, 12, 10}

# Add a new number to the set.
addNewNumber = numberSet.add(int("10"))
print(numberSet)

# Remove a number from the set.
removeSetNumber = numberSet.remove(12)
addRemovedNumBack = numberSet.add(int("12"))
removeAgain = numberSet.remove(10)
print(numberSet)
add10 = numberSet.add(10)
print(numberSet)

# Check if a specific number is present in the set.
if 4 in numberSet:
    print(f"Four is in set!")
else:
    print(f"Four is not in the set")

# Find the union and the intersection of this set and another set of numbers.
anotherSet = {20, 23, 10, 12, 88}

def unionAndIntersection():
    unionSet = sorted(numberSet | anotherSet)
    intersectionSet = sorted(numberSet & anotherSet)
    print(unionSet)
    print(intersectionSet)
unionAndIntersection()

# DICTIONARY!!!
# Create a dictionary with the following keys: "name", "age", "city", and "job", and assign values to them.

myDictionary = dict(name = "Betero", age = "30", city = "Laie", job = "Student")

# Access the value associated with the key "age".
ageValue = myDictionary.get("age")
print(ageValue)

# Change the value of "job".
changeValue = myDictionary["job"] = "Maintenance Technician"
print(myDictionary)

# Add a new key-value pair "hobby" and set its value.
addNewKeyValue = myDictionary["hobby"] = "Coding"
print(myDictionary)

# Loop through the dictionary and print each key-value pair.
for keys, values in myDictionary.items():
    print(f"{keys}: {values}")

# Bonus Challenge
# Create a program that uses all the data types together. The program should:

# - Accept a sentence (string) from the user.
user = input("Type anything here --> ")

# - Count how many words are in the sentence (using integers).
countUserInput = len(user)
print(f"User Input Length: {countUserInput}")

# - Convert the sentence into a list of words.
convertUserInputToSent = list(user)
print(f"User Input List: {convertUserInputToSent}")
# - Create a set of unique words.
firstSet = set(user[:2])
secondSet = set(user[2:])
combineUniqueWords = set(sorted(firstSet | secondSet))
print(f"User Input Unique Set: {combineUniqueWords}")

# - Store the word counts in a dictionary, with the word as the key and its count as the value.
dictionary = dict(wordCount = "", )
print(dictionary)

# - Output all data: original sentence, word count, list, set, and dictionary.
