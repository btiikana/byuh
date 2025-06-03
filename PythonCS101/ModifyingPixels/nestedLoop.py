from PIL import Image

def nestedLoop():
    pixelMatrix = picture.load()
    for x in range(0, picture.width):
        for y in range(0, picture.height):
            r, g, b = pixelMatrix[x, y]
            pixelMatrix[x, y] = (255-r, 255-g, 255-b)
    picture.show()
    

picture = Image.open("SeaDragon.jpg")
nestedLoop()