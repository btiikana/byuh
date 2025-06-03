# Second Function

from PIL import Image, ImageDraw
canvas=Image.new('RGB',(600,600),'white')
img=ImageDraw.Draw(canvas)
for xPos in [0, 100, 200, 300, 400]:
    x=10 + xPos
    x2=50 + xPos
    img.rectangle([x,40,x2,90],outline='red')
canvas.show()