"""
Part 2: Decode with key.
"""


# ------------------------------
# Decode With Key Class
# ------------------------------

class DecodeWithKey:
    # Read input
    def getMessageAndKey(self):
        message = input()
        keyValue = int(input())

        return message, keyValue

    # Create dictionaries
    def createLetterDictionaries(self):
        letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

        letterToNumber = {}
        numberToLetter = {}

        for index in range(len(letters)):
            letter = letters[index]

            letterToNumber[letter] = index
            numberToLetter[index] = letter

        return letterToNumber, numberToLetter

    # Decode character
    def decodeCharacter(self, character, keyValue, letterToNumber, numberToLetter):
        if character == " ":
            return character

        oldCode = letterToNumber[character]

        newCode = oldCode - keyValue
        newCode = newCode % 26

        newCharacter = numberToLetter[newCode]

        return newCharacter

    # Decode message
    def decodeMessage(self, message, keyValue):
        letterToNumber, numberToLetter = self.createLetterDictionaries()

        decodedMessage = ""

        for character in message:
            decodedCharacter = self.decodeCharacter(character, keyValue, letterToNumber, numberToLetter)
            decodedMessage = decodedMessage + decodedCharacter

        return decodedMessage

    # Process message
    def processMessage(self):
        message, keyValue = self.getMessageAndKey()

        decodedMessage = self.decodeMessage(message, keyValue)

        print(decodedMessage)


# ------------------------------
# Main Caller
# ------------------------------

if __name__ == "__main__":
    program = DecodeWithKey()
    program.processMessage()