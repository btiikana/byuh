from PIL import Image, ImageDraw

def moveQueenDown():
    for yPos in [0,100,200]:
        canvas.paste(img,(200,yPos))
    canvas.show()

canvas = Image.new(("RGB"), (300,300), "white")
img = Image.open("Queenblk.png")

moveQueenDown()