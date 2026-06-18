"""
Part 3: Use all keys.
"""


# ------------------------------
# Use All Keys Class
# ------------------------------

class UseAllKeys:
    # Read input
    def getMessage(self):
        message = input()

        return message

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
        message = self.getMessage()

        for keyValue in range(26):
            decodedMessage = self.decodeMessage(message, keyValue)

            print(decodedMessage)


# ------------------------------
# Main Caller
# ------------------------------

if __name__ == "__main__":
    program = UseAllKeys()
    program.processMessage()