descrip = [
    "Your plane has lost all engines. You must make a decision quickly!",
    "You decide to go straight, attempting to pass the mountains.",
    "You turn right, aiming to land in the lake.",
    "You take a left, trying to land on the rocky grounds.",
    "You attempt to pass the mountains but crash!",
    "You land in the lake safely, everyone survives!",
    "You attempt to land on rocky grounds, but the plane crashes!",
    "You successfully pass the mountains, but there's only a 10 percent chance of landing safely."
]

choices = [
    "Do you go STRAIGHT, TURN right, or TAKE left?",
    "Do you keep going or PREPARE for an emergency landing?",
    "Do you brace for impact or SWIM to shore?",
    "Do you RESTART or accept your fate?",
    "Do you want to RESTART or accept the crash?",
    "Do you CELEBRATE or remain cautious?",
    "Do you want to RESTART or accept the crash?",
    "Do you want to ROLL the dice for a safe landing or RESTART?"
]

options = {
    "straight": 1, "turn": 2, "take": 3,
    "prepare": 4, "pass": 7,
    "brace": 5, "swim": 6,
    "restart": 0, "fate": 4,
    "celebrate": 5,
    "roll": 7
}

# Load game progress
startChoice = input("Do you want to RELOAD a game or start a NEW adventure? ")
if startChoice[0].lower() == "r":
    with open("Game.txt", "r") as file:
        level = int(file.readline().strip())
else:
    level = 0

userInput = ""
while userInput.lower() != "q":
    print("\n" + descrip[level])  # Display the current scene
    print(choices[level])  # Show available choices
    userInput = input("Enter your choice or Q to quit/save --> ").lower().strip()

    if userInput in options:
        level = options[userInput]  # Update level based on choice
    elif userInput == "q":
        with open("Game.txt", "w") as file:
            file.write(str(level))  # Save progress
        print("Your level is saved")
        break
    else:
        print("Invalid choice. Try again.")


