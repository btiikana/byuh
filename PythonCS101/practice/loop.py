from PIL import Image, ImageDraw
canvas = Image.new("RGB", (600,600), "white")
img = ImageDraw.Draw(canvas)

# img.rectangle((10,10,30,30), outline = "blue")

for xPos in (0,50,100,150,200,250,300,350,400,450): 
    img.rectangle((10+xPos,40,50+xPos,90), outline = "black")
    img.rectangle((5+xPos,20,55+xPos,40), outline = "black")
    img.rectangle((30+xPos,50,40+xPos,70,), outline = "black")
    img.rectangle((20+xPos,70,25+xPos,90), outline = "black")

canvas.show()

