# Name: Betero Tiikana
# Course: CS 101

# Why don't we see red, green, and blue spots at each position in our picture?
# - Because there are many tiny pixels that we cannot see and with the perfect amount of Red, Green and Blue colors combined we will not be able to see any difference.


# Why is the maximum value of any color component 255?
# - Because in every colors RGB there are 8 bits, so 2**8 there will be a total of 256 but you need to minus the zero which makes it 255.


from PIL import Image, ImageDraw
canvas=Image.new('RGB',(600,600),'white')
img=ImageDraw.Draw(canvas)
for xPos in [0, 100, 200, 300, 400]:
  img.rectangle([10+xPos,40,50+xPos,90],outline='red')
canvas.show()

from PIL import Image, ImageDraw
canvas=Image.new('RGB',(600,600),'white')
img=ImageDraw.Draw(canvas)
for xPos in [0, 100, 200, 300, 400]:
    x=10 + xPos
    x2=50 + xPos
    img.rectangle([x,40,x2,90],outline='red')
canvas.show()

# Explain why both functions do the same thing. (20 Seconds)
# Because they both have the same canvas pixels, the same list and the same formula that can be used to calculate the coordinates for each index in the squared brackets. The two of the functions will have the same results or coordinates thus have the same squares displayed on the canvas.

# State which one you like better. (10 Seconds)
# I like the first function because you can see the list right away xPos in [0, 100, 200, 300, 400]:
# and also you can see the formula here [10+xPos,40,50+xPos,90] needed to calculate the coordinates for the index or items in the squared brackets.





