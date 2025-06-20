from PIL import Image

def modifyColor(color, factor):
    newColor = int(color*factor)
    return newColor

def sunset(img):
    pixelArray = img.load()
    for x in range(0, img.width):
        for y in range(0, img.height):
            r,g,b = pixelArray[x, y]
            r = modifyColor(r, 1.5) # 150%
            g = modifyColor(g, 0.7) # 30%
            b = modifyColor(b, 0.7) # 30%
        pixelArray[x, y] = (r, g, b)
    img.show()

img = Image.open("beach.jpg")
sunset(img)