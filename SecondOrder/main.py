"""
This file contains the main caller code
for the Second Order Assignment.
"""

# InputData & RecurrenceSolver classes fetched
# from inputData.py and recurrenceSolver.py
from inputData import InputData
from recurrenceSolver import RecurrenceSolver
import sys

# Read data from standard input
# run these input methods secondly after the imports
# but before everything else
lineOne = input()
lineTwo = input()
lineThree = input()
lineFour = input()

# Create inputData object
inputData = InputData(lineOne, lineTwo, lineThree, lineFour)

# Get individual value from inputData object
# call getValues method inside inputData and return values then
# store in the local variables

# unpack returned values into locally created variables:
# startValue1, startValue2, c1Value, c2Value
startValue1, startValue2, c1Value, c2Value = inputData.getValues()

# Create solver object
# pass S(1), S(2), c1 and c2 values to RecurrenceSolver obj
# solver stores the RecurrenceSolver obj
solver = RecurrenceSolver(startValue1, startValue2, c1Value, c2Value)

# Get and print r1, r2, p and q
# each variable stores a returned value from the solver object
r1Value = solver.getR1Value()
r2Value = solver.getR2Value()
pValue = solver.getPValue()
qValue = solver.getQValue()

# ------------------------
# Result labels
if solver != None:
    # print("Solver Object is not empty!")
    print("------Result------")
else:
    sys.exit()

# function to print decorative lines
def printLastLine():
    line = "-"*17
    return line
# ------------------------

print(f"r1 = {r1Value}")
print(f"r2 = {r2Value}")
print(f"p = {pValue}")
print(f"q = {qValue}")

# Get and print closed form formula
# formula has a returned formula from getFormula method inside RecurrenceSolver class
formula = solver.getFormula() # return formula from solver method(getFormula())
print(formula)

# Compute and print S(1) all the way to S(10)
for nValue in range(1, 10 + 1):
    answer = solver.computeSValue(nValue)
    print(f"S({nValue}) = {answer}")
lastLine = printLastLine()
print(lastLine)