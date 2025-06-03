# Name: Betero Tiikana
# Course: CS101

from PIL import Image

# Change the pixels to a background Image using a list of pixels (.getdata())
def replaceBaby():
    img = Image.open("babyGreenScreen.png")
    pixelList = img.getdata()
    bgImage = Image.open("GreenTreeBG.jpg")
    bgList = bgImage.getdata()
    modifiedPixelList = []

    # Counter
    pos = 0
    for pixel in pixelList:
        if (132, 238, 39) <= pixel < (147, 255, 40):
            newPixel = bgList[pos]
        else:
            newPixel = pixel
        modifiedPixelList.append(newPixel)
        # Iteration incrementation
        pos = pos + 1
    img.putdata(modifiedPixelList)
    img.show()

#replaceBaby()


# Change the pixels to a background Image using pixel arrays (.load())
def replaceBabyUsingArray():
    img = Image.open("babyGreenScreen.png")
    pixelArray = img.load()
    
    bgImage = Image.open("GreenTreeBG.jpg")
    bgArray = bgImage.load()
    
    width, height = img.size
    
    # Iterate over all the pixels in the image
    for x in range(width):
        for y in range(height):
            # Check if the pixel is within the green screen range
            if (132, 238, 39) <= pixelArray[x, y] < (147, 255, 40):
                # Replace the green pixels from pixelArray with bgArray
                pixelArray[x, y] = bgArray[x, y]
    
    img.show() # Display the modified picture
    # img.save("coolBabyBackground.jpg")

replaceBabyUsingArray()

