"""
This file contains the InputData class, function and logic required
to complete the Second Order Assignment.
"""

# Class to receive, change input data from main.py then
# prep and adjust to return them
class InputData:
    # Initialize data for inputData object
    def __init__(self, lineOne, lineTwo, lineThree, lineFour):
        self.lineOne = lineOne
        self.lineTwo = lineTwo
        self.lineThree = lineThree
        self.lineFour = lineFour

    # function to read all lines and return values
    def getValues(self):
        lineOneParts = self.lineOne.split()
        lineTwoParts = self.lineTwo.split()
        lineThreeParts = self.lineThree.split()
        lineFourParts = self.lineFour.split()

        startValueOne = lineOneParts[1]
        startValueTwo = lineTwoParts[1]
        cOneValue = lineThreeParts[1]
        cTwoValue = lineFourParts[1]

        return startValueOne, startValueTwo, cOneValue, cTwoValue