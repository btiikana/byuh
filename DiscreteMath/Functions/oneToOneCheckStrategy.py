"""
Class to check if a function is one-to-one.
"""

# import class from file
from relationCheckStrategy import RelationCheckStrategy

class OneToOneCheckStrategy(RelationCheckStrategy):
    # function to check if function is one-to-one
    def check(self, relation):
        orderedPairs = relation.getOrderedPairs()

        outputValues = []

        for orderedPair in orderedPairs:
            outputValue = orderedPair[1]

            if outputValue in outputValues:
                return False
            else:
                outputValues.append(outputValue)

        return True

    # function to return the result message
    def getMessage(self, result):
        if result == True:
            return "It is one-to-one."
        else:
            return "It is *not* one-to-one."