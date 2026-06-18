"""
Class to print final result.
"""


# ------------------------------
# Result Class
# ------------------------------

class Result:

    # Constructor
    def __init__(self, inputData, dnf, cnf):
        self.inputData = inputData
        self.dnf = dnf
        self.cnf = cnf

        self.dnfExpression = ""
        self.cnfExpression = ""

        self.getExpressions()

    # Get expressions
    def getExpressions(self):
        self.dnfExpression = self.dnf.getExpression()
        self.cnfExpression = self.cnf.getExpression()

    # Show result
    def show(self):
        print("")
        print("------------------------------------ Results -------------------------------------------")
        print("DNF: " + self.dnfExpression)
        print("CNF: " + self.cnfExpression)
        print("----------------------------------------------------------------------------------------")
        print("")