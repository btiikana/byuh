from PIL import Image, ImageDraw

def moveQueenRight():
    for xPos in [0,100,200]:
        canvas.paste(img,(xPos,xPos))
    canvas.show()

canvas = Image.new(("RGB"), (300,300), "white")
img = Image.open("Queenblk.png")

moveQueenRight()