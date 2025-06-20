from PIL import Image, ImageDraw

def drawHouse(xPos, yPos, color):
    img.rectangle([xPos, yPos, 100 + xPos, 20 + yPos], outline = color)
    img.rectangle([5 + xPos, 20 + yPos, 95 + xPos, 90 + yPos], outline = color)
    img.rectangle([10 + xPos, 45 + yPos, 40 + xPos, 90 + yPos], outline = color)
    img.rectangle([50 + xPos, 45 + yPos, 90 + xPos, 70 + yPos], outline = color)

def frameToFile(num):
    paddedNum = f"{num:02}"
    fileName = "frame" + paddedNum + "House.jpg"
    canvas.save(fileName)

def drawHouses():
    for pos in range(20, 340, 1):
        drawHouse(pos, pos, (255, 0, 0))
        frameToFile(int((pos-20)/40))
        drawHouse(pos, pos, (255, 255, 255))

canvas = Image.new("RGB", (480, 380), (255, 255, 255))
img = ImageDraw.Draw(canvas)
drawHouses()