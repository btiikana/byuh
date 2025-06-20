# Finding Common Letters

phrase1 = "BYUH"
phrase2 = "HOME"
collector = ""
for char in phrase1:
    if char in phrase2:
        collector = collector + char
    else:
        pass
print("Common letter found: " + collector)
