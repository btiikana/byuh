# Name: Betero Tiikana
# Course: CS101

from PIL import Image

def reduceRedTopOneThird():
    img = Image.open("shirt2.jpg")
    pixelArray = img.load()
    width, height = img.size
    for y in range(width // 3):
        for x in range(height):
            r, g, b = pixelArray[x, y]
            r = r//2
            pixelArray[x, y] = (r, g, b)
    img.show()
#reduceRedTopOneThird()

def clearBlueBottomThird():
    img = Image.open("shirt2.jpg")
    pixelArray = img.load()
    width, height = img.size
    for y in range(height - height // 3, height):
        for x in range(width):
            r, g, b = pixelArray[x, y]
            b = 0
            pixelArray[x, y] = (r, g, b)
    img.show()
#clearBlueBottomThird()

def mirrorringHalfTop2Bottom():
    img = Image.open("shirt2.jpg")
    pixelArray = img.load()
    width, height = img.size
    for y in range(height // 2):
        for x in range(width):
            r, g, b = pixelArray[x, y]
            newY = height -y -1
            pixelArray[x, newY] = (r, g, b)
    img.show()
mirrorringHalfTop2Bottom()