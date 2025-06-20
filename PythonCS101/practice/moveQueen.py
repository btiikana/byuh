# Importing Pictures
from PIL import Image, ImageDraw

# Queen Variable & Funtions
def moveQueenRight():
    for xPos in [0,100,200]:
        # Original Queen Starting position
        canvas.paste(img,(0,0))
        # Queen moved to the right
        canvas.paste(img,(xPos,100)) 
    canvas.show()

# Canvas Display commands
canvas = Image.new(("RGB"), (300,300), "white")
img = Image.open("Queenblk.png")

# Call out function
moveQueenRight()

