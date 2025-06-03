# Find the age of Alan
def findAge():
    print("You are asked to find Alan's age")
    person = ["Alan"]
    mysteriousAge = 17
    userGuess = -1
    while userGuess != mysteriousAge:
        userGuess = int(input("What is your guess --> "))

        if userGuess < mysteriousAge:
            print("Guess higher")
        elif userGuess == mysteriousAge:
            print("Your guess is right, Alan is 17 years old")
        else:
            print("Guess lower")

# findAge()

# Create a Library System Simulation

def librarySystemSimulation(books, year, author, uniqueBooks):
    bookTitles = ["The Great Gatsby", "To Kill a Mockingbird", "1984"]
    bookYear = [1990, 2001, 2020]
    bookAuthor = [("Tione Tiikana"), ("Betero Tiikana"), ("Mary Jane")]
    uniqueTitles = [{"The Great Gatsby"}, {"To Kill a Mockingbird"}, {"1984"}]
    library = []

    library.append(books)
    library.append(year)
    library.append(author)
    library.append(uniqueBooks)

# librarySystemSimulation({"The Great Gatsby", 1990, ("Tione Tiikana"), {"The Great Gatsby"}}, {"To Kill a Mockingbird", 2001, ("Betero Tiikana"), {"To Kill a Mockingbird"}}, {"1984", 2020, ("Mary Jane"), {1984}})

def librarySystemSimulation():
    # Initialize the library and unique titles set
    library = []
    uniqueTitles = set()

    # Books information
    books = [
        {"title": "The Great Gatsby", "year": 1990, "authors": ("Tione Tiikana",)},
        {"title": "To Kill a Mockingbird", "year": 2001, "authors": ("Betero Tiikana",)},
        {"title": "1984", "year": 2020, "authors": ("Mary Jane",)}
    ]
    
    # Add books to the library and track unique titles
    for book in books:
        title = book["title"]
        if title not in uniqueTitles:  # Check if title is unique
            library.append(book)
            uniqueTitles.add(title)  # Add to unique titles set
    
    # Display the library
    for book in library:
        print(f"Title: {book['title']}, Year: {book['year']}, Authors: {', '.join(book['authors'])}")

# librarySystemSimulation()

def librarySystemSimulation(books_data):
    # Initialize a set for unique book titles
    uniqueTitles = set()

    # Library to store the books
    library = []

    # Loop over each book in the provided books_data
    for book in books_data:
        title = book["title"]
        year = book["year"]
        authors = book["authors"]

        # Add the book to the library if its title is unique
        if title not in uniqueTitles:
            library.append(book)
            uniqueTitles.add(title)  # Add to unique titles set

    # Display the library
    for book in library:
        print(f"Title: {book['title']}, Year: {book['year']}, Authors: {', '.join(book['authors'])}")


# Now define the books as a list of dictionaries
books_data = [
    {"title": "The Great Gatsby", "year": 1990, "authors": ("Tione Tiikana",)},
    {"title": "To Kill a Mockingbird", "year": 2001, "authors": ("Betero Tiikana",)},
    {"title": "1984", "year": 2020, "authors": ("Mary Jane",)}
]

# Pass the list of books to the function
# librarySystemSimulation(books_data)

def addItems():
    itemList = ["shoes", "clothes"]
    newItem = ("sunglasses")
    itemList.append(newItem)
    print(itemList)

# addItems()

def removeItem():
    itemList = ["shoes", "hats", "sunglasses"]
    itemList.remove("sunglasses")
    print(itemList)

# removeItem()
def createSet():
    uniqueSet = [{"Electronics"}, {"Phones"}, {"Food"}, {"Gloves"}, {"Fruits"}]
    uniqueItem = "Fruits"

    if any(uniqueItem in x for x in uniqueSet):
        print(f"Item: {uniqueItem} is in the unique set")
    else:
        print(f"Item: {uniqueItem} is not the unique set!")

# createSet()

# Find Age

def findAge():
    hiddenAge = []
    userGuess = -1

    print("You are asked to find the age of someone")

    while userGuess not in hiddenAge:
        formula = 6*2
        hiddenAge.append(formula)
        userGuess = int(input("Take a guess between 1 to 12" + "\n" + "Answer here -->"))
        if userGuess in hiddenAge:
            print(f"You guessed it right! The age is {userGuess}!")
            break
        elif userGuess > hiddenAge[-1]:
            print("----------GUESS LOWER----------")
        else:
            print("----------GUESS HIGHER----------")
    
# findAge()

# Loops

def loopsHorizon():
    lists = [1, 2, 3, 4]
    for item in range(len(lists)):
        print(lists[item],"", end = "")
    print()

    for item in lists:
        print(item)
    
# loopsHorizon()


# Analyze and manipulate Data

data = "5 apple 2 orange 5 apple 3 banana, 5 banana 4 kiwi 2 apple, 5 apple, kiwi 2 banana"
storage = []
number = []
string = []

def manipulateData():
    # Split the data string into words
    split = data.split()
    
    # Add the split data to storage
    storage.append(split)
    
    # Loop through the split data to separate numbers and strings
    for item in split:
        if item.isdigit():  # Check if the item is a number
            number.append(int(item))  # Convert to integer and append to number list
        else:
            string.append(item)

    resultString = " ".join(string)
    
    # Print results
    print("Storage:", storage)
    print("Numbers:", number)
    print("String:", resultString)

# Call the function
# manipulateData()

# APPENDING: Data Organizer and Anylyzer

def dataOrganizer(): 
    peopleData = [
    ("John Doe", 101, ["reading", "swimming", "coding"], {"Python", "Java", "SQL"}),
    ("Jane Smith", 102, ["painting", "reading"], {"JavaScript", "React", "CSS"}),
    ("Alice Johnson", 101, ["coding", "drawing"], {"Java", "C++", "Python"}),
    ("Bob Brown", 103, ["hiking", "swimming", "photography"], {"Java", "Python"}),
    ("Charlie Day", 104, ["gaming", "painting", "cycling"], {"HTML", "CSS"}),
    ("Eve White", 105, ["yoga", "running", "painting"], {"JavaScript", "Node.js"}),
    ("Frank Green", 106, ["biking", "swimming", "reading"], {"C", "JavaScript", "HTML"}),
    ("Grace Lee", 107, ["traveling", "dancing"], {"Java", "Spring"})
]
    idStorage = []
    nameStorage = []
    hobbiesStorage = []
    skillsStorage = []


    for person in peopleData:
        idStorage.append(person[1])
        nameStorage.append(person[0])
        hobbiesStorage.append(person[2])
        skillsStorage.append(person[3])
    
    # Compacting Append
    #for person in peopleData:
        # Use extend to add all values in one line
        #list(map(lambda x, y: x.append(y), [idStorage, nameStorage, hobbiesStorage, skillsStorage], [person[1], person[0], person[2], person[3]]))

    #print("IDs:", idStorage)
    #print("Names:", nameStorage)
    #print("Hobbies:", hobbiesStorage)
    #print("Skills:", skillsStorage)
    

#dataOrganizer()

# ACCESSING: Data Organizer and Analyzer

def dataAccess(): 
    studentData = [
    ("John Doe", 101, ["reading", "swimming", "coding"], {"Python", "Java", "SQL"}),
    ("Jane Smith", 102, ["painting", "reading"], {"JavaScript", "React", "CSS"}),
    ("Alice Johnson", 101, ["coding", "drawing"], {"Java", "C++", "Python"}),
    ("Bob Brown", 103, ["hiking", "swimming", "photography"], {"Java", "Python"}),
    ("Charlie Day", 104, ["gaming", "painting", "cycling"], {"HTML", "CSS"}),
    ("Eve White", 105, ["yoga", "running", "painting"], {"JavaScript", "Node.js"}),
    ("Frank Green", 106, ["biking", "swimming", "reading"], {"C", "JavaScript", "HTML"}),
    ("Grace Lee", 107, ["traveling", "dancing"], {"Java", "Spring"})
]
    #Find the names of all Students and Print:

    allStudents = [student[0] for student in studentData] 
    # Equals to:
    # allStudents = []
    # for student in StudentData:
        # allStudents.append(student[0])

    #for name in allStudents:
    # Print Names Vertically
        #print(name)

    # Print Horizontally
    name = [name for name in allStudents]
    # Equals to:
    # name = []
    # for name in allStudents:
        # name.append(name)
    cleanInfo = [] # This will be a list of list, e.g: [["j", "k"]] not ["j", "k"]
    cleanInfo.append(name)
    
    # We need to FLATTEN "cleanInfo" to get the list of strings using a for LOOP, e.g: ["j", "k"]
    flattenCLeanInfo = [item for names in cleanInfo for item in names]
    # Equals to:
    # flattenCleanInfo = []
    # for names in cleanInfo:
        # item in names:
        # flattenCleanInfo.append(item)
    print("".join(flattenCLeanInfo))
    
#dataAccess()

# Print Name and their info cleanly.
john = []
jane = []
alice = []
bob = []
charlie = []
eve = []
frank = []
grace = []

studentData = [
    ("John Doe", 101, ["reading", "swimming", "coding"], {"Python", "Java", "SQL"}),
    ("Jane Smith", 102, ["painting", "reading"], {"JavaScript", "React", "CSS"}),
    ("Alice Johnson", 101, ["coding", "drawing"], {"Java", "C++", "Python"}),
    ("Bob Brown", 103, ["hiking", "swimming", "photography"], {"Java", "Python"}),
    ("Charlie Day", 104, ["gaming", "painting", "cycling"], {"HTML", "CSS"}),
    ("Eve White", 105, ["yoga", "running", "painting"], {"JavaScript", "Node.js"}),
    ("Frank Green", 106, ["biking", "swimming", "reading"], {"C", "JavaScript", "HTML"}),
    ("Grace Lee", 107, ["traveling", "dancing"], {"Java", "Spring"})
]

def printAll():   
    print(f"DIRTY DATA: {"\n"} {studentData} {"\n"} {"------------------------------------------------"}")

def assignData():
    johnD = studentData[0]
    janeS = studentData[1]
    
    # Appending them to john and jane lists
    john.append(johnD)
    jane.append(janeS)

    # Printing John Doe details without square brackets, quotes, and commas
    for item in john:
        name, id_num, hobbies, skills = item  # Unpack the tuple
        print(f"Student Information:\nName: {name}\nID: {id_num}\nHobbies: {', '.join(hobbies)}\nSkills: {', '.join(skills)}\n")
    
    # Printing Jane Smith details without square brackets, quotes, and commas
    for item in jane:
        name, id_num, hobbies, skills = item  # Unpack the tuple
        print(f"Student Information:\nName: {name}\nID: {id_num}\nHobbies: {', '.join(hobbies)}\nSkills: {', '.join(skills)}\n")

# printAll()
# assignData()

personData = [
    ("John Doe", 101, ["reading", "swimming", "coding"], {"Python", "Java", "SQL"}),
    ("Jane Smith", 102, ["painting", "reading"], {"JavaScript", "React", "CSS"}),
    ("Alice Johnson", 101, ["coding", "drawing"], {"Java", "C++", "Python"}),
    ("Bob Brown", 103, ["hiking", "swimming", "photography"], {"Java", "Python"}),
    ("Charlie Day", 104, ["gaming", "painting", "cycling"], {"HTML", "CSS"}),
    ("Eve White", 105, ["yoga", "running", "painting"], {"JavaScript", "Node.js"}),
    ("Frank Green", 106, ["biking", "swimming", "reading"], {"C", "JavaScript", "HTML"}),
    ("Grace Lee", 107, ["traveling", "dancing"], {"Java", "Spring"})
]
skill = personData[0][3]
hobbies = personData[0][2]

#print()
#print("Student Information:","\n""Name:",personData[0][0])
#print("ID:",personData[0][1])
#print("Hobbies:",", ".join(hobbies))
#print("Skills:",", ".join(skill))
#print()


# Extending and Appending

#numbers = [1, 2, 3, 4]

#if 5 in numbers:
    #print("5 is already in the list")
#else:
    #numbers.append(5)
#if ([6, 7]) in numbers:
        #print("6, 7 are already in the list")
#else:
    #numbers.extend([6,7])
#print(numbers)


def extractingData():
    peopleData = [("Alan", 32), ("Rike", 35), ("Ruby", 29)]
    dataSet = set() # Use add() function to add items to set only. Use append() and extend() to add items to list only.
    ageList = []

    for person in peopleData:
        name, age = person
        # Add name to the set for unique names
        dataSet.add(name)
        # Add age to the ageList
        ageList.append(age)
    
    # Step 4: Create a string with names in reverse order (from the set)
    reversed_names = " ".join(reversed(list(dataSet)))
    print("Names in reverse order:", reversed_names)

    # Step 5: Filter out even ages and store them in a new list
    evenAges = [age for age in ageList if age % 2 == 0] # Modulous Operator in use
    print("Even ages:", evenAges)

    # Step 6: Calculate the average age of people with even ages
    if evenAges:
        average_age = sum(evenAges) / len(evenAges)
        print("Average age of people with even ages:", average_age)
    else:
        print("No even ages available.")

# Call the function
#extractingData()

digitList = [1,2,3,4,5,6,7,8,9]
x=10
if x in digitList:
   print( "Yeah for X")
# print ("The End")

text = "hello, Python learners!"
text [7:13]

# print()

# Modifying each pixel

from PIL import Image

def modifyAllPixels():
    photo = Image.open("shirt.webp")
    pixelList = photo.getdata()
    modifiedPixels = []

    for pixel in pixelList:
        r, g, b = pixel
        if 100 < r < 204:
            r = 255

        elif g < 200:
            g = 255
        
        else:
            b = 12
            g = 12
        newColor = r, g, b
        modifiedPixels.append(newColor)
    photo.putdata(modifiedPixels)
    photo.show()
modifyAllPixels()