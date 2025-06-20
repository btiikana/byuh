from PIL import Image

# If it's green turn it to white
def replaceGreen():
    img = Image.open("Alice.jpg")
    pixelList = img.getdata()
    canvas = Image.new("RGB", (img.width, img.height), "white")
    modifedPixelList = []

    for pixel in pixelList:
        if (0, 200, 0) <= pixel < (75, 255, 75):
            newPixel = (255, 255, 255)
        else:
            newPixel = pixel
        modifedPixelList.append(newPixel)
    canvas.putdata(modifedPixelList)
    canvas.show()

#replaceGreen()

# Moving Alice to Machu Pichu
# Picture has to match the background
def replaceAlice():
    img = Image.open("Alice.jpg")
    pixelList = img.getdata()
    bgImage= Image.open("littleMP.jpg")
    bgList = bgImage.getdata()
    modifiedPixelList = []

    pos = 0
    for pixel in pixelList:
        if (0, 200, 0) <= pixel < (75, 255, 75):
            newPixel = bgList[pos]
        else:
            newPixel = pixel
        modifiedPixelList.append(newPixel)
        pos = pos + 1
    img.putdata(modifiedPixelList)
    img.show()

# replaceAlice()


# Replace Baby
def replaceBaby():
    img = Image.open("babyGreenScreen.png")
    pixelList = img.getdata()
    bgImage= Image.open("GreenTreeBG.jpg")
    bgList = bgImage.getdata()
    modifiedPixelList = []

    pos = 0
    for pixel in pixelList:
        if (120, 200, 0) <= pixel < (132,239,15):
            newPixel = bgList[pos]
        else:
            newPixel = pixel
        modifiedPixelList.append(newPixel)
        pos = pos + 1
    img.putdata(modifiedPixelList)
    img.show()

replaceBaby()

# Using an Array to find one eye
def replaceZone():
    img = Image.open("redeyes.jpg")
    pixelArray = img.load()
    width, height = img.size
    x0, y0 = 315, 392
    x1, y1 = 400, 475

    for x in range(width):
        for y in range(height):
            if (x0 < x < x1 and y0 < y <y1):
                if (90, 5, 10) < pixelArray[x, y] < (170, 10, 0):
                    pixelArray[x, y] = (0, 0, 255)
    img.show()
    # img.save("blue-eyes.jpg")

#replaceZone()



