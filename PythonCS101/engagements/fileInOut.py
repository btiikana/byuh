def openFile():
    productList = []
    with open("productFile.txt", "r") as f:
        for line in f:
            product = line[:-1]
            productList.append(product)
            print(product)
            
openFile()