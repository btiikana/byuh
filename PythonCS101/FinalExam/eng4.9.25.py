from PIL import Image

# Final Study Guide

# Write a function that takes a picture as input and decreasess the red of every pixel by 30%

# def decreaseRed(img):
#     # .getdata()
#     # .load()
#     pixelList = img.getdata()
#     newPixeLiist = []
#     for pixel in pixelList:
#         r, g, b, _ = pixel
#         r = int(r * 0.70)
#         newColor = (r, g, b)
#         newPixeLiist.append(newColor)
#     img.putdata(newPixeLiist)
#     img.show()

# img = Image.open("byuh.png")
# decreaseRed(img)

# Write a function that takes a picture and grayscale it. (r + b + g)

def grayScaleList(pic):
    # .getdata()
    # .load()
    pixelList = img.getdata()
    newPixeLiist = []
    for pixel in pixelList:
        r, g, b = pixel
        r = int(r * 0.70)
        grayScale= int((r + g + b) / 3)
        pixel = (grayScale, grayScale, grayScale)
        newPixeLiist.append(pixel)
    img.putdata(newPixeLiist)
    img.show()

def grayScaleArray(img):
    pixelArray = img.load()
    # for x in range(0, img.width):
    for x in range(img.width/2, img.width):
        # for y in range(0, img.height):
        for y in range(img.height/2):
            r, g, b = pixelArray[x, y]
            grayscale = int((r+g+b)/3)
            pixelArray[x, y] = (grayscale, grayscale, grayscale)
    img.show()

img = Image.open("SeaDragon.jpg")
# grayScaleList(img)
# grayScaleArray(img)

#  Write a function to change Charles Babbage's hair to red.

def blackToRed(img):
    pixelList = img.getdata()
    updatedPixelList = []
    for pixel in pixelList:
        r, g, b = pixel
        if (0, 0, 0) <= pixel < (45, 45, 45):
            r = 255
        newPixel = (r, g, b)
        updatedPixelList.append(newPixel)
    img.putdata(updatedPixelList)

def blackToRedByZone(img):
    pixelArray = img.load()
    x0, y0 = 177, 50
    x1, y1 = 277, 100
    for x in range(0, img.width):
        for y in range(0, img.height):
            if x0 <= x < x1 and y0 <= y <= y1:
                r, g, b = pixelArray[x, y]
                if (0, 0, 0) <= pixelArray[x, y] < (45, 45, 45):
                    r = 255
                    pixelArray[x, y] = (r, g, b)
    img.show()

img = Image.open("Charlesbabbage.jpg")
#blackToRed(img)
blackToRedByZone(img)