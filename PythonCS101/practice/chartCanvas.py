def displayCanvas():
    from PIL import Image, ImageDraw
    canvas = Image.new(("RGB"), (700,700), "white")
    img = ImageDraw.Draw(canvas)

    for (xPos) in range(0, 450, 50):
        img.rectangle((10+xPos,40,50+xPos,90), outline = "black")
        img.rectangle((5+xPos,20,55+xPos,40), outline = "black")
        img.rectangle((30+xPos,50,40+xPos,70), outline = "black")
        img.rectangle((20+xPos,70,25+xPos,90), outline = "black")
    canvas.show()
displayCanvas()




