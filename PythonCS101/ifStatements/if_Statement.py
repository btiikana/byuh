# Printing out vowels

phrase = "BYUH"
vowels = "aeiou"
collector = ""

for char in phrase:
    if char.lower() in vowels:
        collector += char

print("Vowels found: " + collector)