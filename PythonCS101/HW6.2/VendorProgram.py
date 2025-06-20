# Betero Tiikana
# Course: CS101

productList = ['burger', 'pizza', 'fried chicken', 'Loco Moco', 'shrimp']
costList = [10, 11, 15, 18, 19]
dataList = []

def choices():
    for count in range(len(productList)):
        print(count + 1, productList[count], costList[count])




def shoppingCart():
    total = 0 
    for count in range(len(dataList)):
        print(count + 1, productList[count], costList[count])
        order = dataList[count]
        total = total + (float(order[1]) * float(order[2]))  
    print(f" The cost before taxes is ${total:.2f}")




def ordering():
    condition = True
    while condition:
        choices()
        order = int(input("What item will you order? (1-5)" + "\n" + "Enter Here: "))
        index = order - 1
        quantity = int(input(f"How many {productList[index]} would you like to order? "))
        dataList.append([productList[index], costList[index], quantity])  
        decide = input("Are you finished? y/n ")
        if decide.lower() == "y":
            condition = False

#ordering()
#shoppingCart()
