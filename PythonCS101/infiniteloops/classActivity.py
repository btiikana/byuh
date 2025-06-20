
#lists
def lists():
    alphaList = ["a", "b", "c", "d", "e"]
    itemList = ["t-shirt", "shorts", "pants", "dress", "shoes"]
    priceList = [10, 11, 15, 18, 19]
    dataList = []

    for index in range(alphaList, itemList):
        print(min(alphaList[index]))
        print(max(itemList[index]))

# lists()

password = 17
userGuess = ""
while userGuess != password:
    userGuess = int(input("Guess a number between 1 and 25: "))
    decide = input("Do you want to continue (y/n) ")
    if decide.lower() == "y":
        userGuess = input("What is the password")





