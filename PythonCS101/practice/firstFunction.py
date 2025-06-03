# First Function

from PIL import Image, ImageDraw
canvas=Image.new('RGB',(600,600),'white')
img=ImageDraw.Draw(canvas)
for xPos in [0, 100, 200, 300, 400]:
  img.rectangle([10,40,50,90],outline='red')
  img.rectangle([110,40,150,90],outline='red')
  img.rectangle([210,40,250,90],outline='red')
  img.rectangle([310,40,350,90],outline='red')
  img.rectangle([410,40,450,90],outline='red')
canvas.show()
