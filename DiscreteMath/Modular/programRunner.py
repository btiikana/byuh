"""
Program runner class.
"""

# Import classes
from encodeWithKey import EncodeWithKey
from decodeWithKey import DecodeWithKey
from useAllKeys import UseAllKeys


# ------------------------------
# Program Runner Class
# ------------------------------

class ProgramRunner:
    # Run program
    def runProgram(self, program):
        program.processMessage()

    # Choose program
    def chooseProgram(self):
        keepRunning = True

        while keepRunning == True:
            print("Choose a program:")
            print("1. Encode with key")
            print("2. Decode with key")
            print("3. Use all keys")
            print("4. Exit")

            choice = input()

            if choice == "1":
                program = EncodeWithKey()
                self.runProgram(program)

            elif choice == "2":
                program = DecodeWithKey()
                self.runProgram(program)

            elif choice == "3":
                program = UseAllKeys()
                self.runProgram(program)

            elif choice == "4":
                keepRunning = False

            else:
                print("Invalid choice.")

            print()


# ------------------------------
# Main Caller
# ------------------------------

runner = ProgramRunner()
runner.chooseProgram()