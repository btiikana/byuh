from PIL import Image

def grayScale(photo):
  photoPixelsList=[]
  pixelList=photo.getdata()
  for photoPixel in pixelList:
    r,g,b = photoPixel
    brightness = (r+g+b)//3 
    photoPixelsList.append((brightness,brightness,brightness))
  photo.putdata(photoPixelsList)
  photo.show()
img = Image.open("shirt.webp")
grayScale(img)

def grayScaleNew(picture):
  pixelsList=[]
  pixelList=picture.getdata()
  for pixel in pixelList:
    r,g,b=pixel
    newAlteredRed = r * 0.299 
    newAlteredGreen = g * 0.587 
    newAlteredBlue = b * 0.114 
    radiance = int(newAlteredRed+newAlteredGreen+newAlteredBlue)
    pixelsList.append((radiance, radiance, radiance))
  picture.putdata(pixelsList)
  picture.show()
pix = Image.open("shirt.webp")
grayScale(pix)

#NAME: BETERO TIIKANA
#COURSE: CS101