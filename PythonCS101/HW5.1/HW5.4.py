from PIL import Image

def test4(picture):
  myArray=picture.load()
  for x in range(picture.width):
    r,g,b= myArray[x,1]
    r=r+50
    g=g+50
    b=b+50
    myArray[x,1]=r,g,b
  picture.show()

picture = Image.open("beach.jpg")
test4(picture)