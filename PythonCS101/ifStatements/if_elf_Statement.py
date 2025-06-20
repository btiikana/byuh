# Printing out Consonants

phrase = "BYUH"
vowels = "aeiou"
collector = ""

for char in phrase:
    if char.lower() in vowels:
        collector = collector
    elif char.lower() not in vowels: 
        collector += char

print("Consonants found: " + collector)