import sys

def findOccurence(word, match):
    cnt = 0
    for char in word:
        if char.lower() in match.lower():
            cnt = cnt + 1
    print(f"There's {cnt} occurence of {match} in '{word}'")

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

# Find how many "e" are in a word
findOccurence(sys.argv[1], sys.argv[2])

# (Home Work Material) Removing Occurences.
def removeOccurence(word, match):
    print(f" Letter '{match}' has been removed from the word '{word.lower().replace(match.lower(), "")}'")

if len(sys.argv) == 1:
    print("Command Line Arguments are missing!!")
    sys.exit

removeOccurence(sys.argv[1], sys.argv[2])
# Pass 2 Arguments from the Command Line.