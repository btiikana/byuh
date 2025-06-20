from PIL import Image, ImageDraw
canvas = Image.new("RGB", [600, 600], "white")
img = ImageDraw.Draw(canvas)
for x in [0, 150, 300, 450]:
    img.rectangle((40 + x, 40, 150 + x, 90), outline = "red")
canvas.show()

