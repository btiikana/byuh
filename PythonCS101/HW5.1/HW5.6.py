from PIL import Image

def test6(picture):
  myArray=picture.load()
  for x in range(picture.width):
    r,g,b= myArray[x,1]
    myArray[x,1]=r,0,0
  picture.show()

picture = Image.open("beach.jpg")
test6(picture)