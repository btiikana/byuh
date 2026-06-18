"""
Main caller code for the Functions Lab Assignment.
"""

# import classes from files
from inputData import InputData
from relation import Relation
from relationFormatter import RelationFormatter
from functionCheckStrategy import FunctionCheckStrategy
from ontoCheckStrategy import OntoCheckStrategy
from oneToOneCheckStrategy import OneToOneCheckStrategy
from bijectionCheckStrategy import BijectionCheckStrategy

# Read data from standard input
lineOne = input()
lineTwo = input()
lineThree = input()

# Create inputData object
inputData = InputData(lineOne, lineTwo, lineThree)

# Get domain, codomain, and ordered pairs
domainValues, codomainValues, orderedPairs = inputData.getValues()

# Create relation object
relation = Relation(domainValues, codomainValues, orderedPairs)

# Create formatter object
formatter = RelationFormatter()

# Format domain, codomain, and relation
domainString = formatter.formatDomain(relation)
codomainString = formatter.formatCodomain(relation)
relationString = formatter.formatRelation(relation)

# Print domain, codomain, and relation
print(domainString)
print(codomainString)
print(relationString)

# Create check objects
functionChecker = FunctionCheckStrategy()
ontoChecker = OntoCheckStrategy()
oneToOneChecker = OneToOneCheckStrategy()
bijectionChecker = BijectionCheckStrategy()

# Check if relation is a function first
functionResult = functionChecker.check(relation)
functionMessage = functionChecker.getMessage(functionResult)

print(functionMessage)

# Only check onto, one-to-one, and bijection if function
if functionResult == True:
    checkers = [
        ontoChecker,
        oneToOneChecker,
        bijectionChecker
    ]

    # Polymorphism
    # checkers have check() and getMessage() functions
    # but logic checkers are different
    for checker in checkers:
        result = checker.check(relation)
        message = checker.getMessage(result)

        print(message)