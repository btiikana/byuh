from PIL import Image

def grayscale():
    pixelArray = img.load()
    for x in range(0, img.width):
        for y in range(0, img.height):
            r,g,b = pixelArray[x, y]
            grayscale = int((r+g+b) / 3)
            pixelArray[x, y] = (grayscale, grayscale, grayscale)
    img.show()

img = Image.open("beach.jpg")
grayscale()