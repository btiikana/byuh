# Betero Tiikana
# CS101

from PIL import Image
photo = Image.open("Charles_Babbage_.jpg")
pixelList = photo.getdata()
updatedList = []

def convertRed(r):
    if r <100:
        r = 0
    else: 
        r = 255
    return(r)
def convertGreen(g):
    if g <100:
        g = 0
    else: 
        g = 255
    return(g)
def convertBlue(b):
    if b <100:
        b = 0
    else: 
        b = 255
    return(b)
def eightColors():
    for p in pixelList:
        r, g, b = p
        r = convertRed(r)
        g = convertGreen(g)
        b = convertBlue(b)

        newPixel = (r, g, b)
        updatedList.append(newPixel)
    return(updatedList)

photo.putdata(eightColors())
photo.show()