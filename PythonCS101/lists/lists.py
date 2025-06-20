itemList = ["t-shirt", "shorts", "pants", "dress", "shoes"]
priceList = [10, 11, 15, 18, 19]
dataList = []

def combineItems():
    for index in range(0, len(itemList)):
        itemObj = []
        # Longway
        #itemObj.append(itemList[index])
        #itemObj.append(priceList[index])
        #Shortway
        dataList.append([itemList[index], priceList[index]])
    print(dataList)

combineItems()
