from PIL import Image

def test5(picture):
  myArray=picture.load()
  for x in range(picture.width):
    r,g,b= myArray[x,1]
    myArray[x,1]=b,g,r
  picture.show()

picture = Image.open("beach.jpg")
test5(picture)