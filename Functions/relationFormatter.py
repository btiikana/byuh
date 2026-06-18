"""
Class that holds logic for styling
and formatting the relation.
"""

class RelationFormatter:
    # function to format domain values
    def formatDomain(self, relation):
        domainValues = relation.getDomainValues()

        domainString = ", ".join(domainValues)

        finalString = f"DOMAIN: {{ {domainString} }}"

        return finalString

    # function to format codomain values
    def formatCodomain(self, relation):
        codomainValues = relation.getCodomainValues()

        codomainString = ", ".join(codomainValues)

        finalString = f"CODOMAIN: {{ {codomainString} }}"

        return finalString

    # function to format ordered pairs
    def formatRelation(self, relation):
        orderedPairs = relation.getOrderedPairs()

        pairStrings = []

        for orderedPair in orderedPairs:
            firstValue = orderedPair[0]
            secondValue = orderedPair[1]

            pairString = f"({firstValue},{secondValue})"

            pairStrings.append(pairString)

        relationString = ", ".join(pairStrings)

        finalString = f"RELATION: {{ {relationString} }}"

        return finalString