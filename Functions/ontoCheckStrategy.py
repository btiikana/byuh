"""
Class to check if a function is onto.
"""

# import class from file
from relationCheckStrategy import RelationCheckStrategy

class OntoCheckStrategy(RelationCheckStrategy):
    # function to check if function is onto
    def check(self, relation):
        codomainValues = relation.getCodomainValues()
        orderedPairs = relation.getOrderedPairs()

        outputValues = []

        for orderedPair in orderedPairs:
            outputValue = orderedPair[1]
            outputValues.append(outputValue)

        for codomainValue in codomainValues:
            if codomainValue not in outputValues:
                return False

        return True

    # function to return the result message
    def getMessage(self, result):
        if result == True:
            return "It is onto."
        else:
            return "It is *not* onto."