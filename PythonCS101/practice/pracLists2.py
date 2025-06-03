from PIL import Image, ImageDraw

# Create a blank canvas of size 600x600 (for example)
canvas = Image.new("RGB", (600, 600), "white")
draw = ImageDraw.Draw(canvas)

# Define the number of points (from 0 to 255)
num_points = 256

# Define the spacing between points (each point should be evenly spaced)
spacing = 2  # Adjust this value for the grid size

# Draw vertical lines (connecting points along the y-axis) from (x, 0) to (x, y)
for y in range(num_points):
    # Draw a line from (x, 0) to (x, y) for each x
    draw.line((y * spacing, 0, y * spacing, y * spacing), fill="black")

    # Draw horizontal lines (to create a squared grid-like pattern)
    draw.line((0, y * spacing, 255 * spacing, y * spacing), fill="black")

# Display the result
canvas.show()
