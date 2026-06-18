"""
Class for input data.
"""

class InputData:
    # constructor
    def __init__(self, lineOne, lineTwo, lineThree):
        self.lineOne = lineOne
        self.lineTwo = lineTwo
        self.lineThree = lineThree

    """
    Function to assign lines to domain, codomain and ordered pairs
    and return them.
    """
    def getValues(self):
        domainValues = self.lineOne.split()
        codomainValues = self.lineTwo.split()
        relationValues = self.lineThree.split()

        orderedPairs = []

        for index in range(0, len(relationValues), 2):
            firstValue = relationValues[index]
            secondValue = relationValues[index + 1]
            orderedPair = (firstValue, secondValue)

            orderedPairs.append(orderedPair)

        return domainValues, codomainValues, orderedPairs