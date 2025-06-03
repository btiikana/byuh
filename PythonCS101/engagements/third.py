# A function that will distinguish matching letters
def findLetters(str):
    compare = "Welcome Home"
    counter = 0
    for char in str.replace(" ", ""):
        if char.lower() in compare.lower():
            # counter = counter + 1
            counter += 1
            # print(char.lower())
            print("There is match")
        else:
            print("No match" + char)
    print(counter)

findLetters("Hello World")