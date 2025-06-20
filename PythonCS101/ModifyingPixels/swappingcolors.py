from PIL import Image

def swapGreenWithBlue():
    pixelArray = img.load()
    for x in range(0, img.width):
        for y in range(0, img.height):
            r,g,b = pixelArray[x, y]
            pixelArray[x, y] = (r, b, g)
    img.show()

img = Image.open("SeaDragon.jpg")
swapGreenWithBlue()