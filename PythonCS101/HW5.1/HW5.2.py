from PIL import Image

def test2(picture):
  myArray=picture.load()
  for x in range(picture.width):
    r,g,b= myArray[x,1]
    b=int(b*01.5)
    myArray[x,1]=r,g,b
  picture.show()

picture = Image.open("beach.jpg")
test2(picture)