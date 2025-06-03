# Name: Betero Tiikana
# Course: CS101

from PIL import Image, ImageDraw

def drawFace(xPos, yPos, color):
    img.ellipse([60 + xPos, 0 + yPos, 150 + xPos, 90 + yPos], outline=color)
    img.ellipse([70 + xPos, 20 + yPos, 90 + xPos, 50 + yPos], outline=color)
    img.ellipse([120 + xPos, 20 + yPos, 140 + xPos, 50 + yPos], outline=color)
    img.ellipse([80 + xPos, 60 + yPos, 130 + xPos, 80 + yPos], outline=color)

def frameToFile(num):
    paddedNum = f"{num:02}"
    fileName = "frame" + paddedNum + "House.jpg"
    canvas.save(fileName)

def drawFaces():
    for pos in range(20, 340, 1):
        if (pos // 40) == 1:
            color = (0, 0, 255)
        elif (pos // 40) == 2:
            color = (0, 255, 0)
        elif (pos // 40) == 4:
            color = (0, 0, 255)
        elif (pos // 40) == 6:
            color = (255, 0, 0)
        elif (pos // 40) == 7:
            color = (255, 255, 0)
        else:
            color = (255, 255, 255)
        drawFace(pos, pos, color)
        frameToFile(int((pos-20)/40))
        drawFace(pos, pos, (255, 255, 255))

def animateFrames():
    frame = []
    for idx in range(0,8):
        paddedIndex = f"{idx:02}"
        frame.append((Image.open("frame" + paddedIndex + "House.jpg")))

    frame[0].save("houseMoving.gif", format = "gif", append_images = frame[0:], save_all = True, duration = 200, loop = 0)

canvas = Image.new("RGB", (480, 380), (255, 255, 255))
img = ImageDraw.Draw(canvas)
drawFaces()
animateFrames()