from PIL import Image

# Using an Array to find one eye and change the values
img = Image.open("redeyes.jpg")
pixelArray = img.load()
width, height = img.size


def changeRedEyeToBlue():
    x0, y0 = 315, 392
    x1, y1 = 400, 475

    for x in range(width):
        for y in range(height):
            if (x0 < x < x1 and y0 < y <y1):
                if (90, 5, 10) < pixelArray[x, y] < (170, 10, 0):
                    pixelArray[x, y] = (0, 0, 255)

def replaceZone():
    x0, y0 = 923, 394
    x1, y1 = 996, 467

    for x in range(width):
        for y in range(height):
            if (x0 < x < x1 and y0 < y <y1):
                if (80, 0, 7) < pixelArray[x, y] < (205, 10, 27):
                    pixelArray[x, y] = (0, 0, 255)
    img.show()
    # img.save("blue-eyes.jpg")

changeRedEyeToBlue()
replaceZone()
