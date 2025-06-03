def stringFunctions(phrase):

    # Capitalize Initial Character.
    print(phrase.capitalize())

    # All characters in Upper Cased.
    print(phrase.upper())
    print(phrase.lower())
    print(phrase.count("0"))
    print(phrase.startswith("h"))
    print(phrase.endswith("d"))

    #length of String or Array
    print(len(phrase))
    print(len(["hello", "hi", "welcome", "Bonjour"]))
    print(phrase.replace("e", "a"))

    # Find any Character in Strings
    print(phrase.find("e"))

    # Splitting Strings into an Array in a List
    print(phrase.split())
    print(phrase.split(","))

    # Choosing Characters
    print(phrase[1:4])
    print(phrase[:5]) #choosing whatever number before 5 to 5.
    print(phrase[5:]) #choosing number 5 and so on till the end of the list.
    print(phrase[6:]) #choosing number 6 and so on till the end of the list.
    print(phrase[0]) #choosing index 0
    for char in phrase:
        if char == "h":
            print("Hello")
    if phrase.startswith("h"):
            print("hello world")
    else:
        print("Goodbye")


inputPhrase=input("write a phrase: ")
stringFunctions(inputPhrase)
