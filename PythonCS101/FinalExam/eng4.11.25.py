from PIL import Image, ImageDraw
# Draw a crowd of faces.

def drawFace(img, x, y):
    img.ellipse([x, y, 100 + x, 100 + y], fill = "yellow")
    img.ellipse([30 + x, 20 + y, 40 + x, 30 + y], fill = "black") # Right eye
    img.ellipse([60 + x, 20 + y, 70 + x, 30 + y], fill = "black") # Left eye
    img.ellipse([30 + x, 65 + y, 70 + x, 80 + y], fill = "red") # Mouth

def drawFaces():
    canvas = Image.new("RGB", (800, 800), "black")
    img = ImageDraw.Draw(canvas)
    for x in range(0, 800, 100):
        for y in range(0, 800, 100):
            drawFace(img, x, y)
    canvas.show()

canvas = Image.new("RGB", (800, 800), "white")
img = ImageDraw.Draw(canvas)
drawFace(img, 350, 350)
drawFaces()



# # String Manipulation

# # Counting the type of characters in a sentence.
#     # char, vowels, consonants, lowercase, uppercase.

# # Characters
# def countChars(sentence):
#     charCounter = 0
#     for char in sentence.replace(" ", ""):
#         charCounter += 1
#     print(f"There are {charCounter} characters in {sentence}")


# # Vowels
# def countVowels(sentence):
#     vowelCounter = 0
#     for char in sentence:
#         if char.lower() in "aeiou":
#             vowelCounter += 1
#     print(f"There are {vowelCounter} vowels in {sentence}")
    




# # Consonants
# def countConsonants(sentence):
#     consonantCounter = 0
#     for char in sentence.replace(" ", ""):
#         if char.lower() not in "aeiou":
#             consonantCounter += 1
#     print(f"There are {consonantCounter} consonants in {sentence}")
    




# # Lowercase
# def countLowercase(sentence):
#     lowercaseCounter = 0
#     for char in sentence.replace(" ", ""):
#         if char.islower():
#             lowercaseCounter += 1
#     print(f"There are {lowercaseCounter} lowercase in {sentence}")
    



# # Uppercase
# def countLowercase(sentence):
#     uppercaseCounter = 0
#     for char in sentence.replace(" ", ""):
#         if char.islower():
#             uppercaseCounter += 1
#     print(f"There are {uppercaseCounter} lowercase in {sentence}")


# sentence = input("Type here -----> ")
# countChars(sentence) 
# countVowels(sentence)
# countConsonants(sentence)
# countLowercase(sentence)
# countLowercase(sentence)