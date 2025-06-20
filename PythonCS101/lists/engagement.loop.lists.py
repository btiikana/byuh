#userGuess= -1
#print("You are asked to guess a number between 1 and 25.")
#while userGuess != 17:
#    userGuess=(int(input("What is your guess? --> ")))
#    if userGuess > 17:
#        print("Guess lower.")
#    elif userGuess==17:
#        print("You are correct!")
#        break
#    else:
#        print("Guess higher.")

list1 = ["apples", "beans", "carrots"]
list2 = [3.00, 2.00, 1.50]
subtotal = 0
for item in list2:
    subtotal = subtotal + item
print(subtotal)