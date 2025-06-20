# Name: Betero Tiikana
# Course: CS101

from PIL import Image

def replaceBaby():
    img = Image.open("babyGreenScreen.png")
    pixelList = img.getdata()
    bgImage = Image.open("GreenTreeBG.jpg")
    bgList = bgImage.getdata()
    modifiedPixelList = []

    pos = 0
    for pixel in pixelList:
        if (132, 238, 39) <= pixel < (147, 255, 40):
            newPixel = bgList[pos]
        else:
            newPixel = pixel
        modifiedPixelList.append(newPixel)
        pos = pos + 1
    img.putdata(modifiedPixelList)
    img.show()

replaceBaby()