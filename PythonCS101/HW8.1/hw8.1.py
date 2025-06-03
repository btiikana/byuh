# Name: Betero Tiikana
# Course: CS101


productList = []
priceList = []
quantityList = []
shoppingList = []

def readProductFile():
    with open("productFile.txt", "r") as productFile:
        for line in productFile:
            product = line[:-1]
            productList.append(product)

def readPriceFile():
    with open("priceFile.txt", "r") as priceFile:
        for line in priceFile:
            price = line[:-1]
            priceList.append(price)

def readQuantityFile():
    with open("quantityFile.txt", "r") as quantityFile:
        for line in quantityFile:
            quantity = line[:-1]
            quantityList.append(quantity)

def storeItemsInShopping():
    for count in range(len(productList)):
        shoppingList.append((productList[count], priceList[count], quantityList[count]))
    
    print("My Orders from shoppingList:")
    print(shoppingList)

def fetchMenuFromShoppingList():
    totalAmount = 0
    myOrder = shoppingList
    print("My total order:")
    
    for item in myOrder:
        product, price, quantity = item
        price = float(price)
        quantity = int(quantity)
        totalPrice = price * quantity
        totalAmount += totalPrice
        print(f"{item} --> Total Price: ${totalPrice:.2f}")
    print(f"\nTotal amount for all of my orders: ${totalAmount:.2f}")

readProductFile()
readPriceFile()
readQuantityFile()
storeItemsInShopping()
fetchMenuFromShoppingList()