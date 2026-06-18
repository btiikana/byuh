"""
Class to check if a relation is a function.
"""

# import class from file
from relationCheckStrategy import RelationCheckStrategy

class FunctionCheckStrategy(RelationCheckStrategy):
    # function to check if relation is a function
    def check(self, relation):
        orderedPairs = relation.getOrderedPairs()

        inputValues = []

        for orderedPair in orderedPairs:
            inputValue = orderedPair[0]

            if inputValue in inputValues:
                return False
            else:
                inputValues.append(inputValue)

        return True

    # function to return the result message
    def getMessage(self, result):
        if result == True:
            return "This is a function."
        else:
            return "This is *not* a function."