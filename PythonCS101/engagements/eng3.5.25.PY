def readFile(fileName):
    returnList = []
    with open(fileName, "r") as productFile:
        for line in productFile:
            lineItem = line.strip()
            returnList.append(lineItem)
    return returnList

def printMenu(list1, list2):
    for idx in range(len(list1)):
        print(idx+1, list1[idx], list2[idx])\
        
def ordering(list1, list2):
    if len(list1) == len(list2):
        isOrdering = True
        returnList = []
        while isOrdering == True:
            printMenu(list1, list2)
            choice = int(input("What item will you order? (1-5)? "))
            idx = choice-1
            quantity = int(input("How many? "))
            returnList.append([list1[idx], list2[idx], quantity])
            done = input("Are you finished? (y/n)? ")
            if done.lower() == "y":
                isOrdering = False
        return returnList

def shoppingCart(list):
    total = 0
    for idx in range(len(list)):
        print(list[idx])
        order = list[idx]
        total = total+float(order[1]*int(order[2]))
    print(f" The cost before taxes is ${total:.2f}")

productList = readFile("productFile.txt")
prizeList = readFile("priceFile.txt")
orderList = ordering(productList, prizeList)
shoppingCart(orderList)