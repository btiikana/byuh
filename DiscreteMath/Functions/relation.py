"""
Class for relation.
"""

class Relation:
    # Constructor
    def __init__(self, domainValues, codomainValues, orderedPairs):
        self.domainValues = domainValues
        self.codomainValues = codomainValues
        self.orderedPairs = orderedPairs

    """
    Functions to return domain, codomain, and ordered
    pair values.
    """
    def getDomainValues(self):
        return self.domainValues

    def getCodomainValues(self):
        return self.codomainValues

    def getOrderedPairs(self):
        return self.orderedPairs