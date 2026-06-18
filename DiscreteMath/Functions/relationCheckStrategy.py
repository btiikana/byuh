"""
Parent class for relation checks.
Each check class will use the same method names.
"""

class RelationCheckStrategy:
    # function to check the relation
    def check(self, relation):
        pass

    # function to return the result message
    def getMessage(self, result):
        pass