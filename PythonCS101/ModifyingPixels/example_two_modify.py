from PIL import Image

def modifyPicture(img):
    pixelArray = img.load()
    print(img.width, img.height)
    for x in range(0, img.width, 20): # Skipping x pixels by 20 pixels
        for y in range(0, img.height, 20): # Skipping y pixels by 20 pixels
            r,g,b = pixelArray[x, y]
            r = int(r*1.1)
            g = int(g*0.25)
            b = int(b*0.25)
            pixelArray[x, y] = (r,g,b)
    img.show()

img = Image.open("beach.jpg")
modifyPicture(img)