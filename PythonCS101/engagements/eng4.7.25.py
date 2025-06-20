# Name: Betero Tiikana
# Course: CS101

# Change the words to ASCII (Secret Messages)

def secretMessage(message):
    hiddenMessage= ""
    for char in message:
        hiddenMessage += str(ord(char)) + ","
    print(hiddenMessage)

secretMessage("The house is a long way away")








# def upperCaseEveryWord(phrase):
#     words = phrase.split(" ")
#     upperCase = True
#     newPhrase = ""
#     for word in words:
#         if upperCase == True:
#             newPhrase += word.upper() + " "
#         else:
#             newPhrase += word.upper() + " "
#         upperCase = not upperCase
#     print(newPhrase)

# upperCaseEveryWord("The house is a long way away")

# Write a program that upper cases every other word in a sentence.

# def upperCaseEveryOther(phrase):
#     words = phrase.split(" ")
#     upperCase = True
#     newPhrase = ""
#     for word in words:
#         if upperCase == True:
#             newPhrase += word.upper() + " "
#         else:
#             newPhrase += word.lower() + " "
#         upperCase = not upperCase
#     print(newPhrase)

# upperCaseEveryOther("The house is a long way away")


# Input program
# def upperCaseEveryOther(userInput):
#     words = userInput.split(" ")
#     upperCase = False
#     newPhrase = ""
#     for word in words:
#         if upperCase == True:
#             newPhrase += word.upper() + " "
#         else:
#             newPhrase += word.lower() + " "
#         upperCase = not upperCase
#     print(newPhrase)

# upperCaseEveryOther(input("Enter a sentence to be converted here --> "))










# Write a function to find a percentage of genders in the class

# def percentageGenders(string):
#     male = 0
#     female = 0
#     for char in string:
#         if char == "F":
#             female += 1
#         elif char == "M":
#             male += 1
#     female = female/len(string) * 100
#     male = male/len(string) * 100
#     print(f"There are {int(female)} females and {int(male)} males in the classroom") # Delete ".2f" to make it an integer and use int()

# percentageGenders("FFFMMMMMFFMMM")