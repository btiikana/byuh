"""
This file contains the RecurrenceSolver class
for the First Order Assignment.
"""

class RecurrenceSolver:
    # Initialize data for solver object
    def __init__(self, startValue, cValue, gValue):
        self.startValue = float(startValue)
        self.cValue = float(cValue)
        self.gValue = float(gValue)

    # function to return the closed form formula
    def getFormula(self):
        # firstPart1 = self.value + "^(n-1)"
        # firstPart2 = "*" + self.startValue
        firstPart = f"{self.cValue}^(n-1) * {self.startValue}"
        sigmaPart = f"sigma({self.cValue}^(n-i) * {self.gValue})"

        formula = f"S(n) = {firstPart} + {sigmaPart}"

        return formula

    # function to compute S(n)
    def computeSValue(self, nValue):
        # compute first part: c^(n-1) * S(1)
        firstExponentValue = nValue - 1
        firstPowerValue = self.cValue ** firstExponentValue

        firstPart = firstPowerValue * self.startValue

        # compute sigma part
        sigmaTotal = 0.0

        for i in range(2, nValue + 1):
            sigmaExponentValue = nValue - i
            sigmaPowerValue = self.cValue ** sigmaExponentValue

            termValue = sigmaPowerValue * self.gValue

            newSigmaTotal = sigmaTotal + termValue
            sigmaTotal = newSigmaTotal

        # add first part and sigma part
        sValue = firstPart + sigmaTotal

        return sValue