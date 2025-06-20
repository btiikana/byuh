from PIL import Image
newList = []
def grayScale(img):
    pixelArray = img.getdata()
    for p in pixelArray:
        r, g, b = p
        aver = (r+g+b)// 3
        p = (aver, aver, aver)
        newList.append(p)
    img.putdata(newList)
    img.show()
picture = Image.open("seaDragon.jpg")
# grayScale(picture)
from PIL import Image
newList = []
whitePinkList = []
def white2Pink(img):
    pixelArray = img.getdata()
    for p in pixelArray:
        if (200, 200, 200)<=p<=(255, 255, 255):
            newColor = (255, 175, 175)
        else:
            newColor = p

        whitePinkList.append(newColor)
    img.putdata(whitePinkList)
    img.show()
picture = Image.open("seaDragon.jpg")
white2Pink(picture)

# EIGHT COLORS:
# 5 Simple Color Channels

#black = (0, 0, 0)
#white = (255, 255, 255)
#red = (255, 0, 0)
#green = (0, 255, 0)
#blue = (0, 0, 255)

# 3 Color Channels

#yellow = (255, 255, 0)
#cyan = (0, 255, 255)
#magenta = (255, 0, 255)

from PIL import Image
img = Image.open("Charles_Babbage_.jpg")
pixelList = img.getdata()
updatedList = []

def changeRed(r):
    if r <100:
        r = 0
    else: 
        r = 255
    return(r)
def changeGreen(g):
    if g <100:
        g = 0
    else: 
        g = 255
    return(g)
def changeBlue(b):
    if b <100:
        b = 0
    else: 
        b = 255
    return(b)
def eightColors():
    for p in pixelList:
        r, g, b = p
        r = changeRed(r)
        g = changeGreen(g)
        b = changeBlue(b)

        newPixel = (r, g, b)
        updatedList.append(newPixel)
    return(updatedList)

img.putdata(eightColors())
img.show()


