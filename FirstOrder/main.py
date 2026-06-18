"""
This file contains the main caller code
for the First Order Assignment.
"""

# InputData & RecurrenceSolver classes fetched
# from inputData.py and recurrenceSolver.py
from inputData import InputData
from recurrenceSolver import RecurrenceSolver

# Read data from standard input
# run these input methods secondly after the imports
# but before everything else
lineOne = input()
lineTwo = input()
lineThree = input()

# Create inputData object
inputData = InputData(lineOne, lineTwo, lineThree)

# Get individual value from inputData object
# call each method inside inputData and return value then
# store in the local variable

# ---------------------------------------------------
# startValue stores startValue to be used in solver
# startValue = inputData.getStartValue() # return startValue
# # cValue stores cValue to be used later in solver obj
# cValue = inputData.getCValue() # return cValue
# # gValue stores a returned gValue to be used later by solver obj
# gValue = inputData.getGValue() # return gValue
# ---------------------------------------------------

# unpack returned values into locally created variables:
# startValue, cValue, gValue
startValue, cValue, gValue = inputData.getValues()

# Create solver object
# pass start,c and g values to RecurrenceSolver obj
# solver stores the RecurrenceSolver obj
solver = RecurrenceSolver(startValue, cValue, gValue)

# Get and print closed form formula
# formula has a returned formula from getFormula method inside RecurrenceSolver class
formula = solver.getFormula() #return formula from solver method(getFormula())
print(formula)

# Compute and print S(1) all the way to S(10)

# -------------------------------------
# # call computeSValue method -- sequence 1
# answer = solver.computeSValue(1)
# print(f"S(1) = {answer}")

# # call computeSValue method -- sequence 2
# answer = solver.computeSValue(2)
# print(f"S(2) = {answer}")

# # call computeSValue method -- sequence 3
# answer = solver.computeSValue(3)
# print(f"S(3) = {answer}")

# # call computeSValue method -- sequence 4
# answer = solver.computeSValue(4)
# print(f"S(4) = {answer}")

# # sequence 5
# answer = solver.computeSValue(5)
# print(f"S(5) = {answer}")

# # call computeSValue method -- sequence 6
# answer = solver.computeSValue(6)
# print(f"S(6) = {answer}")

# # call computeSValue -- sequence 7
# answer = solver.computeSValue(7)
# print(f"S(7) = {answer}")

# # call compute -- sequence 8
# answer = solver.computeSValue(8)
# print(f"S(8) = {answer}")

# # call compute method -- sequence 9
# answer = solver.computeSValue(9)
# print(f"S(9) = {answer}")

# #call compute... sequence 10
# answer = solver.computeSValue(10)
# print(f"S(10) = {answer}")
# -------------------------------------

for nValue in range(1, 10 + 1):
    answer = solver.computeSValue(nValue)
    print(f"S({nValue}) = {answer}")