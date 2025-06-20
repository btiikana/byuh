# Basic String Operations

str = "Hello World, this is a string!"

# Get the length
print(len(str))

# Repeat the variable
print(str * 3)

# Replace the string or any character in the string
print(str.replace("H", "J"))
print(str.replace("Hello", "Halo"))

# Splitting strings
print(str.split(","))

# Decides and distinguish if the string Starts with a given "character" and displays a Boolean statement.
print(str.startswith("H")) # will get True since the string starts with "H"
print(str.startswith("k")) # will get False since the string doesn't start with "k"

# Decides and distinguish what the string ends with, and it will also emit a Boolean statement.
print(str.endswith("a"))
print(str.endswith("l"))
print(str.endswith("!"))

# All Upper Cased Characters
print(str.upper()) # Upper Function will have no arguments but remember to include brackets!!!

#All Characters Lower Cased
print(str.lower()) # Lowers Function will have no arguments but remember to include brackets!!!