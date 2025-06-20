from PIL import Image

def test5(picture):
  myArray=picture.load()
  for x in range(picture.width):
    r,g,b= myArray[x,1]
    myArray[x,1]=b,g,r
  picture.show()
canvas = Image.new("RGB", [1000,1000], "red")

test5(canvas)
  
        
    
    