# Negate Pixels on the bottom left
from PIL import Image

def negateColor():
    pixelArray = pic.load()
    for x in range(0, pic.width):
        for y in range(0, pic.height):
                r, g, b = pixelArray[x, y]
                pixelArray[x, y] = (255-r, 255-g, 255-b)
    pic.show()

pic = Image.open("SeaDragon.jpg")
negateColor()