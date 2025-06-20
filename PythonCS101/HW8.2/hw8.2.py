

###############################################################################################################

def readFile(fileName):
    returnList = []
    with open(fileName, "r") as productFile:
        for line in productFile:
            lineItem = line[:-1]
            returnList.append(lineItem)
    return returnList

def printMenu(list1, list2, list3):
    for idx in range(len(list1)):
        print(idx+1, list1[idx], list2[idx], list3[idx])

def ordering(list1, list2, list3, shoppingFile):
    returnList = []
    with open(shoppingFile, "r") as shoppingFile:
        for line in shoppingFile:
            parts = line.strip().split(",")
            if len(parts) == 3:
                productName = parts[0].strip()
                productCost = float(parts[1].strip())
                productQuantity = int(parts[2].strip())
                
                if productName in list1:
                    idx = list1.index(productName)
                    returnList.append([list1[idx], list2[idx], list3[idx], productQuantity])
    return returnList

def shoppingCart(list):
    total = 0
    print("Your Receipt:")
    for idx in range(len(list)):
        order = list[idx]
        print(f"{order[0]} - ${order[1]} each x {order[3]} units")
        total += float(order[1]) * int(order[3])
    print(f" The cost before taxes is ${total:.2f}")

productList = readFile("productFile.txt")
prizeList = readFile("priceFile.txt")
orderList = ordering(productList, prizeList, prizeList, "shopping.txt")
shoppingCart(orderList)
