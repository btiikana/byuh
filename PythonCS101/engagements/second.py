# A function that will tell us a new member is entering
def churchClass():
    # name = input('What is your name? ')
    age = int(input("How old are you? "))
    # RS/EQ > 18
    # YM/YW 12 - 18
    # Primary < 12

    if age >= 18:
        print(age + "Go to RS or EQ")
    elif 12 <= age < 18:
        print("Go to YM/YW")
    else:
        print(age + "Go to primary.")

churchClass()