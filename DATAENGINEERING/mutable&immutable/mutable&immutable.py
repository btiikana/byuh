# In Python, immutable items are those whose values cannot be changed once they are created. Once an immutable object is created, its state (value) cannot be modified. On the other hand, mutable objects can have their values changed after creation.

# Examples of Immutable Data Types:
# - Strings
# - Tuples
# - Frozen sets (an immutable version of a set)
# - Integers
# - Floats
# - Booleans

# Examples of Mutable Data Types:
# - Lists
# - Sets
# - Dictionaries

# Let's explore these immutable data types in more detail:
#1. Strings (Immutable)
#Once a string is created, you can't change its individual characters.

my_string = "Hello"
# Trying to modify a string directly will raise an error
# my_string[0] = 'h'  # TypeError: 'str' object does not support item assignment

# You can create a new string by modifying the original one
my_string = "h" + my_string[1:]
print(my_string)  # Output: 'hello'
#Here, you can't directly change my_string[0] from "H" to "h", but you can create a new string by combining parts of the original.

#2. Tuples (Immutable)
#Tuples are ordered collections of items that can't be changed after creation (no item assignment, additions, or removals).

my_tuple = (1, 2, 3, 4)

# Attempting to modify a tuple directly raises an error
# my_tuple[0] = 10  # TypeError: 'tuple' object does not support item assignment

# You can't add or remove items in a tuple either
# my_tuple.append(5)  # AttributeError: 'tuple' object has no attribute 'append'
#While you can't modify the tuple directly, you can create a new tuple by combining other tuples or adding elements.

my_tuple = my_tuple + (5,)
print(my_tuple)  # Output: (1, 2, 3, 4, 5)
#3. Frozen Sets (Immutable Set)
#Frozen sets are like regular sets, but they are immutable, meaning you can't add or remove elements.


my_frozenset = frozenset([1, 2, 3])

# Trying to add or remove an element will raise an error
# my_frozenset.add(4)  # AttributeError: 'frozenset' object has no attribute 'add'
# my_frozenset.remove(1)  # AttributeError: 'frozenset' object has no attribute 'remove'
#4. Integers and Floats (Immutable)
#Both int and float are immutable. You can't change their value once they're created, but you can create new variables that hold modified values.


x = 10
# You can't change the value of x directly
# x[0] = 5  # TypeError: 'int' object does not support item assignment

# But you can reassign a new value to x
x = x + 5
print(x)  # Output: 15
# 5. Booleans (Immutable)
# Booleans (True and False) are also immutable.


flag = True
# flag cannot be changed like this
# flag[0] = False  # TypeError: 'bool' object does not support item assignment

# However, you can create a new value based on the existing one
flag = not flag
print(flag)  # Output: False

# Why Immutable Types Matter
# - Hashable: Immutable types can be used as keys in dictionaries or as elements in sets because they have a constant hash value (i.e., their identity doesn't change).
# - Thread-Safety: Since immutable objects cannot be changed, they can be shared between threads without worrying about one thread modifying the value while another is using it.
# - Efficiency: Immutable objects are generally faster to access and compare, as their value cannot change after creation.

# Conclusion
# Immutable types include: int, float, bool, str, tuple, and frozenset.
# Mutable types include: list, set, and dict.