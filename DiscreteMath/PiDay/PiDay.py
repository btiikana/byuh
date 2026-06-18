"""
PiDay Assignment:
This file contains classes and functions required
to complete the PiDay Lab for CS206.
"""
import math as m

class IsEvenIsOdd:
    # eo = even-odd object
    # Initialize data for eo object
    def __init__(eo, nValue):
        eo.nValue = int(nValue)

    # check if int is even function
    def isEven(eo):
        if eo.nValue % 2 == 0:
            return True

        else:
            return False

    # function to check if number is odd
    def isOdd(eo):
        if eo.nValue % 2 == 1:
            return True
        else:
            return False

# Gregory-Leibiniz Algorithm Class 
class GregoryLeibnizAlgo:
    # greg = gregory-leibniz algo obj.
    # Initialize data for greg algo obj.
    def __init__(greg, total, numerator, denominator):
        greg.total = total
        greg.numerator = numerator
        greg.denominator = denominator

    def approximatePi(greg, nValue):
        for iteration in range(nValue):
            fraction = greg.numerator / greg.denominator

            # Create evenodd obj.
            eo = IsEvenIsOdd(iteration)

            # check if eo obj is even then add, else subtract fraction
            if eo.isEven():
                newTotal = greg.total + fraction
                greg.total = newTotal
            else:
                newTotal = greg.total - fraction
                greg.total = newTotal
            
            # re-assign and update denominator and total
            oldDenom = greg.denominator # old value from old denominator
            newDenom = oldDenom + 2 # increase denominator by 2
            greg.denominator = newDenom

        return greg.total



# Nilakantha Algorithm Class
class NilakanthaAlgo:
    # nila = nilakantha algo obj.
    # Initilaize data for nilakantha algo object
    def __init__(nila, total, numerator, firstDenom, secondDenom, thirdDenom):
        nila.total = total
        nila.numerator = numerator
        nila.firstDenom = firstDenom
        nila.secondDenom = secondDenom
        nila.thirdDenom = thirdDenom

    def approximatePi(nila, nValue):
        for iteration in range(nValue):
            denominator = nila.firstDenom * nila.secondDenom * nila.thirdDenom
            fraction = nila.numerator / denominator

            # Create evenodd obj.
            eo = IsEvenIsOdd(iteration)

            # check if eo obj is even then add, else subtract fraction
            if eo.isEven():
                newTotal = nila.total + fraction
                nila.total = newTotal
            else:
                newTotal = nila.total - fraction
                nila.total = newTotal

            # re-assign and update denominators
            oldFirstDenom = nila.firstDenom
            oldSecondDenom = nila.secondDenom
            oldThirdDenom = nila.thirdDenom

            newFirstDenom = oldFirstDenom + 2
            newSecondDenom = oldSecondDenom + 2
            newThirdDenom = oldThirdDenom + 2

            nila.firstDenom = newFirstDenom
            nila.secondDenom = newSecondDenom
            nila.thirdDenom = newThirdDenom
        
        return nila.total

#Limit Algorithm Class
class LimitAlgo:
    def approximatePi(limit, nValue):
        xValue = nValue

        degreeValue = 180 / xValue
        radianValue = m.radians(degreeValue)

        sinValue = m.sin(radianValue)

        approximatePiValue = xValue * sinValue

        return approximatePiValue

# Test part 1
# ieio = IsEvenIsOdd(input(f"--- Test Part 1 --- \nType number here: "))
# print(f"You typed {ieio.nValue}:")
# print(f"The isEven function returns {ieio.isEven()}")
# print(f"The isOdd function returns {ieio.isOdd()}")

# Testing part 2 and 3
# iterationValue = int(input("\n--- Test Part 2 & 3 --- \nType number of iterations: "))
# greg = GregoryLeibnizAlgo(0, 4, 1)
# answer = greg.approximatePi(iterationValue)
# print(f"Real Pi Value: {m.pi}\nGregory Approximate Pi: {answer}")

# Test part 4
# nila = NilakanthaAlgo(3, 4, 2, 3, 4)
# answer = nila.approximatePi(iterationValue)
# print(f"Nilakantha Approximate Pi: {answer}")

# limit = LimitAlgo()
# answer = limit.approximatePi(iterationValue)
# print(f"Limit Approximate Pi: {answer}")

# Program caller
nValue = int(input("Type N value here: "))
algorithmChoice = input("Type algorithm choice GL, N, or L: ").upper()

if algorithmChoice == "GL":
    algo = GregoryLeibnizAlgo(0, 4, 1)
    algoName = "Gregory-Leibniz"

elif algorithmChoice == "N":
    algo = NilakanthaAlgo(3, 4, 2, 3, 4)
    algoName = "Nilakantha"

elif algorithmChoice == "L":
    algo = LimitAlgo()
    algoName = "Limit"

else:
    algo = None
    algoName = "Invalid"

# Polymorphism
if algo != None:
    answer = algo.approximatePi(nValue)

    print(f"N Value: {nValue}")
    print(f"Algorithm Used: {algoName}")
    print(f"Approximate Pi: {answer}")
    print(f"The Real Pi: {m.pi}")

else:
    print("Invalid algorithm choice.")
    print("Please enter GL, N, or L.")