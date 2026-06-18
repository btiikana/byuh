"""
Part 1: Encode with key.
"""


# ------------------------------
# Encode With Key Class
# ------------------------------

class EncodeWithKey:
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

    # Encode character
    def encodeCharacter(self, character, keyValue, letterToNumber, numberToLetter):
        if character == " ":
            return character

        oldCode = letterToNumber[character]

        newCode = oldCode + keyValue
        newCode = newCode % 26

        newCharacter = numberToLetter[newCode]

        return newCharacter

    # Encode message
    def encodeMessage(self, message, keyValue):
        letterToNumber, numberToLetter = self.createLetterDictionaries()

        encodedMessage = ""

        for character in message:
            encodedCharacter = self.encodeCharacter(character, keyValue, letterToNumber, numberToLetter)
            encodedMessage = encodedMessage + encodedCharacter

        return encodedMessage

    # Process message
    def processMessage(self):
        message, keyValue = self.getMessageAndKey()

        encodedMessage = self.encodeMessage(message, keyValue)

        print(encodedMessage)


# ------------------------------
# Main Caller
# ------------------------------

if __name__ == "__main__":
    program = EncodeWithKey()
    program.processMessage()