# Name: Betero Tiikana
# Course: CS101

from PIL import Image, ImageDraw

def drawGreenHouse(xPos, yPos, color):
    img.rectangle([xPos, yPos, 100 + xPos, 20 + yPos], outline = color)
    img.rectangle([5 + xPos, 20 + yPos, 95 + xPos, 90 + yPos], outline = color)
    img.rectangle([10 + xPos, 45 + yPos, 40 + xPos, 90 + yPos], outline = color)
    img.rectangle([50 + xPos, 45 + yPos, 90 + xPos, 70 + yPos], outline = color)

def frameToFile(num):
    paddedNum = f"{num:02}"
    fileName = "frame" + paddedNum + "House.jpg"
    canvas.save(fileName)

def drawGreenHouses():
    for pos in range(20, 340, 1):
        drawGreenHouse(pos, pos, (0, 255, 0))
        frameToFile(int((pos-20)/40))
        drawGreenHouse(pos, pos, (255, 255, 255))

def animateFrames():
    frame = []
    for idx in range(0,8):
        paddedIndex = f"{idx:02}"
        frame.append((Image.open("frame" + paddedIndex + "House.jpg")))

    frame[0].save("houseMoving.gif", format = "gif", append_images = frame[0:], save_all = True, duration = 200, loop = 0)

canvas = Image.new("RGB", (480, 380), (255, 255, 255))
img = ImageDraw.Draw(canvas)
drawGreenHouses()
animateFrames()