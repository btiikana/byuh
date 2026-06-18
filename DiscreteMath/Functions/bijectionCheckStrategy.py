"""
Class to check if a function is a bijection.
"""

# import classes from files
from relationCheckStrategy import RelationCheckStrategy
from ontoCheckStrategy import OntoCheckStrategy
from oneToOneCheckStrategy import OneToOneCheckStrategy

class BijectionCheckStrategy(RelationCheckStrategy):
    # function to check if function is a bijection
    def check(self, relation):
        ontoChecker = OntoCheckStrategy()
        oneToOneChecker = OneToOneCheckStrategy()

        ontoResult = ontoChecker.check(relation)
        oneToOneResult = oneToOneChecker.check(relation)

        if ontoResult == True and oneToOneResult == True:
            return True
        else:
            return False

    # function to return the result message
    def getMessage(self, result):
        if result == True:
            return "It is a bijection."
        else:
            return "It is *not* a bijection."