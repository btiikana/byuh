descrip = ["You are on a beach and there are birds skimming just above the water.", "You are in a forest and it is dark and gloomy.", "You are swimming in the water near the birds, you notice a black fin cutting the waves.", "You become lost!"]

choices = ["Do you GO into the forest or JUMP in the water?", "Do you want to RETURN to the beach or go DEEPER into the Forest?", "Do you want to check out the fin or swim for SHORE?", "Do you want to RESTART or stay lost?"]

options = ["go01", "jump02", "return00", "deeper03", "check03", "swim00", "restart00", "stay03"]

startChoice = input("Do you want to RELOAD a game or place a NEW adventure? ")
if startChoice[0].lower() == "r":
    with open("Game.txt", "r") as file:
        level = int(file.readline())
else:
    level = 0

user = "new"
while user.lower() != "q":
    print(descrip[level])
    print(choices[level])
    user = input("Enter your choice or Q to quit/save --> ")
    for count in range(level*2, (level*2)+2):
        if user.lower() == options[count][-2:]:
            level = int(options[count][-2:])
        elif user[0].lower() == "q":
            with open("Game.txt", "w") as file:
                file.write(str(level))
                user = "q"
            print("Your level is saved")
            break