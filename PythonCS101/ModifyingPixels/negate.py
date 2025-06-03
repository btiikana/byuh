from PIL import Image

def grayscale():
    pixelArray = img.load()
    for x in range(0, img.width):
        for y in range(0, img.height):
            r,g,b = pixelArray[x, y]
            grayscale = int((r+g+b) / 3)
            pixelArray[x, y] = (grayscale, grayscale, grayscale)
    img.show()

def negate():
    pixelArray = img.load()
    for x in range(0, img.width):
        for y in range(0, img.height):
            r,g,b = pixelArray[x, y]
            pixelArray[x, y] = (255-r, 255-g, 255-b)
    img.show()

def swapGreenWithBlue():
    pixelArray = img.load()
    for x in range(0, img.width):
        for y in range(0, img.height):
            r,g,b = pixelArray[x, y]
            pixelArray[x, y] = (r, b, g)
    img.show()

def swapGreenWithBlueTopLeft():
    pixelArray = img.load()
    for x in range(0, img.width //2):
        for y in range(0, img.height //2):
            r,g,b = pixelArray[x, y]
            pixelArray[x, y] = (r, b, g)
    img.show()

def swapGreenWithBlueBottomLeft():
    pixelArray = img.load()
    for x in range(0, img.width //2):
        for y in range(0, img.height //2):
            r,g,b = pixelArray[x, y]
            pixelArray[x, y] = (r, g, b)
    img.show()

def swapGreenWithBlueBottomRight():
    pixelArray = img.load()
    for x in range(img.width //2, img.width):
        for y in range(0, img.height, img.height):
            r,g,b = pixelArray[x, y]
            pixelArray[x, y] = (r, b, g)
    img.show()

img = Image.open("SeaDragon.jpg")
# grayscale()
# negate()
# swapGreenWithBlue()
swapGreenWithBlue()
# swapGreenWithBlueBottomLeft()
# swapGreenWithBlueBottomRight()