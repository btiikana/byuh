"""
This file contains the RecurrenceSolver class
for the Second Order Assignment.
"""

import math as m


class RecurrenceSolver:
    # Initialize data for solver object
    def __init__(self, startValue1, startValue2, c1Value, c2Value):
        self.startValue1 = float(startValue1)
        self.startValue2 = float(startValue2)
        self.c1Value = float(c1Value)
        self.c2Value = float(c2Value)

        # compute r1 and r2 using the quadratic formula
        aValue = 1.0
        bValue = -self.c1Value
        cValue = -self.c2Value

        insideValue = (bValue ** 2) - (4 * aValue * cValue)
        rootValue = m.sqrt(insideValue)

        self.r1Value = (-bValue + rootValue) / (2 * aValue)
        self.r2Value = (-bValue - rootValue) / (2 * aValue)

        # check if r1 and r2 are the same
        if self.r1Value == self.r2Value:
            self.sameRoots = True
        else:
            self.sameRoots = False

        # compute p and q
        if self.sameRoots == False:
            numeratorValue = self.startValue2 - (self.startValue1 * self.r2Value)
            denominatorValue = self.r1Value - self.r2Value

            self.pValue = numeratorValue / denominatorValue
            self.qValue = self.startValue1 - self.pValue

        else:
            self.pValue = self.startValue1

            if self.r1Value != 0:
                self.qValue = (self.startValue2 / self.r1Value) - self.pValue
            else:
                self.qValue = 0.0

    # function to get r1 value
    def getR1Value(self):
        return self.r1Value

    # function to get r2 value
    def getR2Value(self):
        return self.r2Value

    # function to get p value
    def getPValue(self):
        return self.pValue

    # function to get q value
    def getQValue(self):
        return self.qValue

    # function to return the closed form formula
    def getFormula(self):
        if self.sameRoots == False:
            firstPart = f"({self.pValue})({self.r1Value})^(n-1)"
            secondPart = f"({self.qValue})({self.r2Value})^(n-1)"

            formula = f"S(n) = {firstPart} + {secondPart}"

        else:
            firstPart = f"({self.pValue})({self.r1Value})^(n-1)"
            secondPart = f"({self.qValue})(n-1)({self.r1Value})^(n-1)"

            formula = f"S(n) = {firstPart} + {secondPart}"

        return formula

    # function to compute S(n)
    def computeSValue(self, nValue):
        # compute exponent part: n - 1
        exponentValue = nValue - 1

        # compute S(n) when r1 and r2 are different
        if self.sameRoots == False:
            firstPowerValue = self.r1Value ** exponentValue
            secondPowerValue = self.r2Value ** exponentValue

            firstPart = self.pValue * firstPowerValue
            secondPart = self.qValue * secondPowerValue

            # add first part and second part
            sValue = firstPart + secondPart

        # compute S(n) when r1 and r2 are the same
        else:
            powerValue = self.r1Value ** exponentValue

            firstPart = self.pValue * powerValue
            secondPart = self.qValue * exponentValue * powerValue

            # add first part and second part
            sValue = firstPart + secondPart

        return sValue