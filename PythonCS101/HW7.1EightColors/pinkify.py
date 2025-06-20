# Betero Tiikana
# CS101

from PIL import Image
whitePinkList = []
def white2Pink(pic):
    pixelArray = pic.getdata()
    for p in pixelArray:
        if (200, 200, 200)<=p<=(255, 255, 255):
            newColor = (255, 175, 175)
        else:
            newColor = p

        whitePinkList.append(newColor)
    pic.putdata(whitePinkList)
    pic.show()
picture = Image.open("seaDragon.jpg")
white2Pink(picture)
