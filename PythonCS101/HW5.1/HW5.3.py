from PIL import Image

def test3(picture):
  myArray=picture.load()
  for x in range(picture.width):
    r,g,b= myArray[x,1]
    b = 0
    myArray[x,1]=r,g,b
  picture.show()

picture = Image.open("beach.jpg")
test3(picture)