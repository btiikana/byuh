# Betero Tiikana
# CS101

from PIL import Image

darkMode = []

def darkModeProgram(pic):
    pixelArray = pic.getdata()
    
    # Define colors to change white and black
    whiteToBlackColor = (0, 0, 0)
    blackToWhiteColor = (255, 255, 255)
    anyOtherColorToWhiteColor = (255, 255, 255)
    
    for p in pixelArray:
        if p == (255, 255, 255):  # White pixel
            darkMode.append(whiteToBlackColor)
        elif p == (0, 0, 0):  # Black pixel
            darkMode.append(blackToWhiteColor)
        elif (10, 10, 10) <=p<= (240, 240, 240):
            darkMode.append(anyOtherColorToWhiteColor)
        else:
            darkMode.append(p)  # Other pixels remain unchanged
    
    pic.putdata(darkMode)
    pic.show()

# Open an image file
picture = Image.open("destiny.png")
darkModeProgram(picture)

