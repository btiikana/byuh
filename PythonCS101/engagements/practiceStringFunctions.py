def stringFunctions(sentence):
    print(sentence.lower())
    print(sentence.upper())
    print(sentence.split(" "))
    print(len(listFunctions))
    print(sentence.find("l"))
    print(sentence.startswith("A"))
    print(sentence.endswith("D"))
    print(sentence.startswith("l"))
    print(sentence.endswith("k"))

listFunctions = input("Write a sentence here: ")
stringFunctions(listFunctions)

