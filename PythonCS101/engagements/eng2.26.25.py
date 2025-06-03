#myList = ["peter", "james", "john"]
#for idx in range(0, len(myList)):
#    print(myList(idx))

#for item in myList:
#    print(item)

#cnt = 0
#while cnt < len(myList):
#    print(myList(cnt))
#    cnt = cnt + 1

#loopCount = 0
#isLooping = True
#while isLooping:
#    print(myList[loopCount])

from PIL import Image

def cropImg(img):
    canvas = Image.new("RGB", (img.width, img.height), "white")
    left, top , right, bottom = 140, 180, 200, 210
    cropSection = img.crop((left, top, right, bottom))
    canvas.paste(cropSection, (img.width // 2 - cropSection.width // 2, img.height))
    canvas.paste(cropSection, (0, 0))
    canvas.save("Charles_Babbage.jpg")
    canvas.show()

#Quiz Review

from PIL import Image
whiteToGreenList = []
def whiteTGreen(pic):
    pixelArray = pic.getdata()
    for p in pixelArray:
        if (200, 200, 200)<=p<=(255, 255, 255):
            newColor = (0, 100, 0)
        else:
            newColor = p

        whiteToGreenList.append(newColor)
    pic.putdata(whiteToGreenList)
    pic.show()
picture = Image.open("seaDragon.jpg")
# whiteTGreen(picture)


def redToGreen(pic):
    pixelArray = pic.getdata()
    redToGreenList = []
    for pixel in pixelArray:
        r, g, b = pixel
        if 160 < b <255:
            newColor = (77, 120, 7)
        else:
            newColor = pixel

        whiteToGreenList.append(newColor)
    pic.putdata(redToGreenList)
    pic.show()
picture = Image.open("seaDragon.jpg")
#redToGreen(picture)

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