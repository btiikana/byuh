"""
Class to handle data inputs.
"""


# ------------------------------
# Input Data Class
# ------------------------------

class InputData:

    # Constructor
    def __init__(self):
        self.firstLine = input()

        self.variables = []
        self.rows = []
        self.expectedRows = 0

        self.makeVariables()
        self.makeExpectedRows()

        self.secondLine = input()

        self.readRows()

    # Make variables
    def makeVariables(self):
        firstLineValues = self.firstLine.split()

        self.variables = firstLineValues[:-1]

    # Make expected rows
    def makeExpectedRows(self):
        self.expectedRows = 2 ** len(self.variables)

    # Read rows
    def readRows(self):
        for count in range(self.expectedRows):
            line = input()
            rowValues = line.split()

            self.rows.append(rowValues)

    # Get variables
    def getVariables(self):
        return self.variables

    # Get rows
    def getRows(self):
        return self.rows

    # Get expected rows
    def getExpectedRows(self):
        return self.expectedRows

    # Get variables and rows
    def getVariablesAndRows(self):
        return self.variables, self.rows