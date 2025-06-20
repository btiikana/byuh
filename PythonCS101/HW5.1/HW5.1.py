from PIL import Image

def test1(picture):
  myArray=picture.load()
  for x in range(picture.width):
    r,g,b= myArray[x,1]
    r=int(r*0.3)
    myArray[x,1]=r,g,b
  picture.show()

picture = Image.open("beach.jpg")
test1(picture)