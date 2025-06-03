from PIL import Image

def modifyPicture(img):
    pixelArray = img.load()
    print(img.width, img.height)
    for x in range(0, img.width, 20): # stepper
        for y in range(0, img.height, 20): # stepper
            r,g,b = pixelArray[x, y]
            pixelArray[x, y] = int(
                int(r*1.5),
                int(g*0.7),
                int(b*0.3),
            )
    img.show()

img = Image.open("SeaDragon.jpg")
modifyPicture(img)
