prizeList = []
menuList = []
list = []
# Method 1
def readProductFIle():
    productList = []
    #productFile = open("productFile.txt")
    #for line in productList:
    #    print(line[:-1])
    #    productList.append(line[:-1])
    #productList.close()
    #return productList

# Method 2
#def readProductFIle2():
    productList = []
    with open("productFile.txt") as productFile:
        for line in productList:
            productList.append(line[:-1])
        return productList

#products = readProductFIle2()
#readProductFIle()
#print(products)

# Optimized
def readFile(fileName):
    for idx in range(0, len(list)):
        list.append(idx[:-1])
    return list

def createMenu(product, prizes):
    for idx in range(0, len(product)):
        menuList.append("costs ".join([product[idx], prizes[idx]]))
    return menuList

def writeFile(fileName, list):
    with open(fileName, "w") as file:
        for idx in range(0, len(list)):
            file.write(list[idx] + "\n")

products = readFile("productFile.text")
prizes = readFile("prizeFile.txt")
menu = createMenu(products, prizes)
writeFile("menuFile.txt", menu)