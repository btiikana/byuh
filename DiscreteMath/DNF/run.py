"""
Main file to run program.
"""

from inputData import InputData
from dnf import Dnf
from cnf import Cnf
from result import Result


# ------------------------------
# Program Runner Class
# ------------------------------

class ProgramRunner:

    # Start program
    def start(self):
        inputData = self.makeInputData()
        dnf = self.makeDnf(inputData)
        cnf = self.makeCnf(inputData)
        result = self.makeResult(inputData, dnf, cnf)

        self.showResult(result)

    # Make input data
    def makeInputData(self):
        inputData = InputData()

        return inputData

    # Make DNF
    def makeDnf(self, inputData):
        variables, rows = inputData.getVariablesAndRows()

        dnf = Dnf(variables, rows)

        return dnf

    # Make CNF
    def makeCnf(self, inputData):
        variables, rows = inputData.getVariablesAndRows()

        cnf = Cnf(variables, rows)

        return cnf

    # Make result
    def makeResult(self, inputData, dnf, cnf):
        result = Result(inputData, dnf, cnf)

        return result

    # Show result
    def showResult(self, result):
        result.show()


# ------------------------------
# Main Caller
# ------------------------------

# create ProgramRunner obj before starting the program
runner = ProgramRunner()
runner.start() #calls start function to start the program