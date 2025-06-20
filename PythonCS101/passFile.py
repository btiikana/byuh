# Name: Betero Tiikana
# Course: CS101

import sys
from PIL import Image

def passFileName(picture):
  myArray=picture.load()
  picture.show()

picture = Image.open("SeaDragon.jpg")
sys.argv[1] = picture
passFileName(picture)