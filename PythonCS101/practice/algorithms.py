# Question 2 (I'm using "+" Operator)
def connectString():
    print("What's Up" + " " + "Man?")

connectString()

# Question 3 (I'm practicing .Join Operator learned from Preparation Material: Mathematical Operators and Concatenating Strings)
def repeatString():
    aloha = "Hello World"
    print(" ".join([aloha, "- "]) * 4)

repeatString()

# Question 4 (I'm practicing "f" string Operator learned from Preparation Material: Mathematical Operators and Concatenating Strings)
def displayImage():
    from PIL import Image
    picDisplay = Image.open("is7.png")
    picDisplay.show()

displayImage()

# Question 5 (I like using the "f" string so I'm gonna use it again)
def addNumbers():
    firstNumber = int(input("Enter First Number: "))
    secondNumber = int(input("Enter Second Number: "))
    sumTotal = (firstNumber + secondNumber)
    print(f"This is the Sum-Total {sumTotal}")

addNumbers()
