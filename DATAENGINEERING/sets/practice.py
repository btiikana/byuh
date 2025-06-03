# Create sets for each subject from the given lists (Math, Science, History)
mathStudents = {"Alice", "Bob", "Charlie", "David", "Eve"}
scienceStudents = {"Charlie", "David", "Alice", "Frank"}
historyStudents = {"Alice", "Eve", "George", "Bob"}
#print(f"Set for Math Students {mathStudents}\nSet for Science Students: {scienceStudents}\nSet for History Students: {historyStudents}\n")

# Find the total number of unique students who are enrolled in at least one subject. This should be done using a set operation.
def totalNumber():
    uniqueStudents = mathStudents|scienceStudents|historyStudents
    print(f"Total Amount of Unique Students: {uniqueStudents}")

# Find the students who are enrolled in both Math and Science.
def commonStudents():
    commonNames = scienceStudents&mathStudents
    print(f"Common Students in Math and Science: {commonNames}")

# Find the students who are enrolled in either Math or History, but not both.
def mathHistoryStudents():
    eitherNames = mathStudents^historyStudents
    print(f"Students either in Math or History but not both: {eitherNames}")

# Find the students who are enrolled in all three subjects (Math, Science, History).
def allSubjectStudents():
    allNames = mathStudents&scienceStudents&historyStudents
    print(f"Students enrolled in all 3 Classes: {allNames}")

# Remove any student from the sets who is not enrolled in at least two subjects.
def removeStudent():
    names = []
    firstNames = mathStudents - scienceStudents
    names.append(firstNames)
    secondNames = scienceStudents - historyStudents
    names.append(secondNames)
    thirdNames = historyStudents - mathStudents
    names.append(thirdNames)
    

    print(f"Student that is not enrolled in at least 2 classes: {names}")

# Create a set of students who are enrolled in only one subject.

# Find the students who are enrolled in either Math or Science but NOT History.

#totalNumber()
#commonStudents()
#mathHistoryStudents()
#allSubjectStudents()
#removeStudent()



# Task: Social Media Friends List
# You work for a social media company and need to perform some analysis on users' friend lists. The goal is to identify mutual friends between two users and get the total number of unique friends across two users.

# Outright changing the List Squared Brackets to Sets Wavy Brackets
# userA = ["John", "Alice", "Bob", "David"]
# userB = ["Alice", "David", "Eva", "Charles"]
userA = {"John", "Alice", "Bob", "David"}
userB = {"Alice", "David", "Eva", "Charles"}


def mutualFriends():
    mutualNames = userA&userB
    print(f"Mutual Friends: {mutualNames}")

def uniqueFriends():
    uniqueNames = userA|userB
    print(f"Unique Friends: {uniqueNames}")

def notFriendsYet():
    notFriendsNames = userA^userB
    print(f"Not Friends Yet: {notFriendsNames}")

#mutualFriends()
#uniqueFriends()
#notFriendsYet()

# Converting Lists to Sets
userA = ["John", "Alice", "Bob", "David"]
userB = ["Alice", "David", "Eva", "Charles"]

uASet = set()
uBSet = set()

def convertingListsToSets():
    for name in userA:
        uASet.add(name)
    for name in userB:
        uBSet.add(name)
def mutualFriends():
    mutualNames = sorted(uASet&uBSet)
    print(f"Mutual Friends: {mutualNames}")

def uniqueFriends():
    uniqueNames = sorted(uASet|uBSet)
    print(f"Unique Friends: {uniqueNames}")

def notFriendsYet():
    notFriendsNames = sorted(uASet^uBSet)
    print(f"Not Friends Yet: {notFriendsNames}")

convertingListsToSets()
mutualFriends()
uniqueFriends()
notFriendsYet()