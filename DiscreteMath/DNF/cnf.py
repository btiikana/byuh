"""
Class to build CNF result.
"""


# ------------------------------
# CNF Class
# ------------------------------

class Cnf:

    # Constructor
    def __init__(self, variables, rows):
        self.variables = variables
        self.rows = rows

        self.terms = []
        self.expression = ""

        self.makeExpression()

    # Make one term
    def makeTerm(self, inputValues):
        termParts = []

        for index in range(len(self.variables)):
            variable = self.variables[index]
            value = inputValues[index]

            if value == "0":
                termParts.append(variable)

            else:
                termParts.append(variable + "'")

        term = "(" + " + ".join(termParts) + ")"

        return term

    # Make expression
    def makeExpression(self):
        for row in self.rows:
            inputValues = row[:-1]
            outputValue = row[-1]

            if outputValue == "0":
                term = self.makeTerm(inputValues)
                self.terms.append(term)

        if len(self.terms) == 0:
            self.expression = "1"

        else:
            self.expression = "".join(self.terms)

    # Get expression
    def getExpression(self):
        return self.expression

    # Get term count
    def getTermCount(self):
        return len(self.terms)