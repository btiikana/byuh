def findVowels(name):
    vowels = ["a", "e", "i", "o", "u"]
    # for idx in (0, len(name))
    collector = ""
    for idx in range(0,len(name)):
        if name[idx].lower() in vowels:
            collector = collector + name[idx]
        else:
            collector = collector
    print("These are the vowels: " + collector)

findVowels("BrIgham")