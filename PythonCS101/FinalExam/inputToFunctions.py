# Name: Betero Tiikana
# Course: CS101

# Write a function that accepts a picture as a parameter, decreases the blue values in the lower left quarter by 28% and negates the pixels in the upper right quarter. 
# Return the modified picture to the main program and display the picture from there.
from PIL import Image

def decreaseBlueValuesAndNegate(pic):
    pixelArray = pic.load()
    width, height = pic.size
    
    # Bottom left quarter
    for y in range(height // 2, height):
        for x in range(width // 2):
            r, g, b = pixelArray[x, y]
            newB = int(b * 0.72) # decrease blue by 28%
            pixelArray[x, y] = (r, g, newB)
    
    # Upper right quarter 
    for y in range(height // 2):
        for x in range(width // 2, width):
            r, g, b = pixelArray[x, y]
            pixelArray[x, y] = (255 - r, 255 - g, 255 - b) # negate pixels

    pic.show()
    return pic
    
img = Image.open("shirt2.jpg")
modifiedImg = decreaseBlueValuesAndNegate(img)