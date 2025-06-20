from PIL import Image, ImageDraw
def drawHouse(img):
    img.ellipse((0,0,50,20), outline = "blue")
    img.rectangle((0,20,50,50), outline = "red")

    canvas.show()

canvas = Image.new(("RGB"), (300,300), "white")
img = ImageDraw.Draw(canvas)
drawHouse(img)