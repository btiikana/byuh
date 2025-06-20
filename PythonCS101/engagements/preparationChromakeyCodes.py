from PIL import Image

img = Image.open("Alice.jpg")
pixelList = img.getdata()
background= Image.open("littleMP.jpg")
bgList = background.getdata()
newList = []

def attachDogToGreenScreen():
    pos = 0
    for pix in pixelList:
        if (0, 200, 0) <= pix <(75, 255, 75):
            newPixel = bgList[pos]
        else:
            newPixel = pix
        newList.append(newPixel)
        pos = pos + 1
    img.putdata(newList)
    img.show()

attachDogToGreenScreen()

# In class Codes: