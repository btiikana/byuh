# Move a picture to the right.

from PIL import Image

def movePicture(picture):
    for x in [0, 100, 200, 300, 400, 500, 600]:
        picture.paste(img, (x, 540))
    picture.show()
canvas = Image.new("RGB", [600,600], "white")
img = Image.open("KingBlk.gif")
movePicture(canvas)

