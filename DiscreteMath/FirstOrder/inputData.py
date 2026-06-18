"""
This file contains the InputData class, function and logic required
to complete the First Order Assignment.
"""
# Class to receive, change input data from main.py then
# prep and adjust to return them
class InputData:
    # Initialize data for inputData object
    # def __init__(self):
    # call input methods, store store each data
    # directly in each self.variable
    #     self.lineOne = input()
    #     self.lineTwo = input()
    #     self.lineThree = input()
    def __init__(self, lineOne, lineTwo, lineThree):
        self.lineOne = lineOne
        self.lineTwo = lineTwo
        self.lineThree = lineThree

    # ------------------------------------------------
    # function to get S(1) value
    # def getStartValue(self):
    #     lineOneParts = self.lineOne.split()
    #     startValue = lineOneParts[1]

    #     return startValue # return to 

    # # function to get c value
    # def getCValue(self):
    #     lineTwoParts = self.lineTwo.split()
    #     cValue = lineTwoParts[1]

    #     return cValue

    # # function to get g(n) value
    # def getGValue(self):
    #     lineThreeParts = self.lineThree.split()
    #     gValue = lineThreeParts[1]

    #     return gValue
    # ------------------------------------------------

    # function to read all lines and return values
    def getValues(self):
        lineOneParts = self.lineOne.split()
        lineTwoParts = self.lineTwo.split()
        lineThreeParts = self.lineThree.split()

        startValue = lineOneParts[1]
        cValue = lineTwoParts[1]
        gValue = lineThreeParts[1]

        return startValue, cValue, gValue

