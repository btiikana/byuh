# Pre-Defined Functions
#  print(abs(-9))
# price = float(input("Enter the price of the item "))
# numberOfItems = int(input("Enter the number of items desired "))
# subTotal = price * numberOfItems
# print(f"This is the Sub-Total ${subTotal:.2f}")

# User Defined Funtions
def invoice():
    price = float(input("Enter the price of the item "))
    numberOfItems = int(input("Enter the number of desired item "))
    subTotal = price * numberOfItems
    print(f"This is the Sub-Total ${subTotal:.2f}")

invoice()

