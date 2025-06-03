#Working with Modulus Operator to find even and odd numbers

#EVEN NUMBERS CONDITION
for x in range(20):
    if x % 2 == 0: # any integer divisable by 2 and has no remainder is even, in other worde any integer without any remainder is even!!!!!
        print(f"{x} is even")
    else:
        print(f"{x} is odd")

# ODD NUMBERS CONDITION
for y in range(50):
    if y % 2 != 0:
        print(f"{y} is odd")
    else:
        print(f"{y} is even")

# Working with Reversing Operator
myList = [1, 2, 3, 4]
reversedList = myList[::-1]
print(reversedList)

# Changing strings into reverse.

string = "Aloha"
reversedString = string[::-1]

if reversedString != string[::-1]:
    print(string)
else:
    print(reversedString)
    