# Concatenate Strings using "f" String Operator
#def joinStrings():
    #firstString = int(input("Enter the price of an item $"))
    #secondString = int(input("Enter the amount desired: "))
    #subTotal = (firstString * secondString)
    #print(f"{"Your Total is $"}{subTotal:.2f}")

#joinStrings()

# Concatenate Strings using Modulus Operator
def connectKnots():
    myKnot = " Peace "
    andKnot = "and "
    yourKnot = "Love"
    all = (myKnot + andKnot + yourKnot)
    print(" ".join([all, "--"]) * 5)

connectKnots()