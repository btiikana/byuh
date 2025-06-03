from PIL import Image

def swapRedToBlue():
    pixelArray = picture.load()
    for x in range(0, picture.width):
        for y in range(0, picture.height):
            r, g, b = pixelArray[x, y] # assigning the pixels in the [x, y]
            # Swap the value of red to blue.
            pixelArray[x, y] = (b, g, r)
    picture.show() # we're only commanding to display the changes made to the pixels.

def setValueToZero():
    pixelArray = picture.load()
    for x in range(0, picture.width):
        for y in range(0, picture.height):
            r, g, b = pixelArray[x, y] # assigning the pixels in the [x, y]
            # Set values for all channels to zero.
            pixelArray[x, y] = (0, 0, 0)
    picture.show() # we're only commanding to display the changes made to the pixels.

def setValueToTwoHundredFiftyFive():
    pixelArray = picture.load()
    for x in range(0, picture.width):
        for y in range(0, picture.height):
            r, g, b = pixelArray[x, y] # assigning the pixels in the [x, y]
            pixelArray[x, y] = (r+255, g+255, b+255)
    picture.show() # we're only commanding to display the changes made to the pixels.

def negatePixels():
    pixelArray = picture.load()
    for x in range(0, picture.width):
        for y in range(picture.height // 2, picture.height): # the loop is only working from half of the y axis and down to the end of the picture below.
            r, g, b = pixelArray[x, y] # assigning the pixels in the [x, y]
            pixelArray[x, y] = (255-r, 255-g, 255-b)
    picture.show() # we're only commanding to display the changes made to the pixels.

picture = Image.open("SeaDragon.jpg")
swapRedToBlue()
# setValueToZero()
# setValueToTwoHundredFiftyFive()
# negatePixels()


            