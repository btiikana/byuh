#A dictionary in Python is a built-in data type that allows you to store data in key-value pairs. It’s an unordered collection that supports fast lookups and modifications.
# - Keys must be immutable types (strings, numbers, tuples).
# - Values can be any type

#Here’s a comprehensive guide to understanding and using dictionaries in Python:



#1. Creating a Dictionary################################
#A dictionary is created using curly braces {} or the dict() constructor.

# Using curly braces
my_dict = {'key1': 'value1', 'key2': 'value2'}

# Using the dict() constructor
my_dict2 = dict(key1='value1', key2='value2')



#2. Accessing Values#######################################
#You can access dictionary values by using the keys.

my_dict = {'name': 'Alice', 'age': 25}

# Access value using the key
print(my_dict['name'])  # Output: Alice

# Using .get() to access the value (returns None if key does not exist)
print(my_dict.get('age'))  # Output: 25
print(my_dict.get('address'))  # Output: None (no error)



#3. Adding and Updating Items##############################
#To add or update an item, use the key and assign a value.

my_dict = {'name': 'Alice', 'age': 25}

# Add a new key-value pair
my_dict['address'] = '123 Main St'

# Update an existing key-value pair
my_dict['age'] = 26
print(my_dict)  # Output: {'name': 'Alice', 'age': 26, 'address': '123 Main St'}



#4. Removing Items################################################
#You can remove items using various methods.
my_dict = {'name': 'Alice', 'age': 25, 'address': '123 Main St'}

# Remove a key-value pair using del
del my_dict['address']  # Removes the 'address' key-value pair
print(my_dict)  # Output: {'name': 'Alice', 'age': 25}

# Remove a key-value pair using pop() (also returns the value)
removed_value = my_dict.pop('age')
print(removed_value)  # Output: 25
print(my_dict)  # Output: {'name': 'Alice'}

# Remove all items using clear()
my_dict.clear()
print(my_dict)  # Output: {}



#5. Checking for Keys and Values#####################################
#To check whether a dictionary contains a certain key or value, you can use the in operator or methods like keys() and values().


my_dict = {'name': 'Alice', 'age': 25}

# Check if a key exists
print('name' in my_dict)  # Output: True
print('address' in my_dict)  # Output: False

# Check if a value exists
print(25 in my_dict.values())  # Output: True
print('Alice' in my_dict.values())  # Output: True



#6. Looping Through a Dictionary#################################################
#You can loop through a dictionary in several ways:

my_dict = {'name': 'Alice', 'age': 25}

# Loop through keys
for key in my_dict:
    print(key)  # Output: name, age

# Loop through keys using .keys()
for key in my_dict.keys():
    print(key)  # Output: name, age

# Loop through values using .values()
for value in my_dict.values():
    print(value)  # Output: Alice, 25

# Loop through both keys and values using .items()
for key, value in my_dict.items():
    print(f"{key}: {value}")
# Output:
# name: Alice
# age: 25



#7. Nested Dictionaries#######################################################
#Dictionaries can store other dictionaries as values (nested dictionaries).

my_dict = {
    'person1': {'name': 'Alice', 'age': 25},
    'person2': {'name': 'Bob', 'age': 30}
}

# Accessing values in a nested dictionary
print(my_dict['person1']['name'])  # Output: Alice



#8. Dictionary Comprehensions####################################################
#Like list comprehensions, you can use dictionary comprehensions to create or modify dictionaries.

# Create a dictionary with squares of numbers
squares = {x: x**2 for x in range(5)}
print(squares)  # Output: {0: 0, 1: 1, 2: 4, 3: 9, 4: 16}



#9. Merging Dictionaries##########################################################
#You can merge dictionaries using the update() method or the ** unpacking operator.


dict1 = {'a': 1, 'b': 2}
dict2 = {'b': 3, 'c': 4}

# Using update() method
dict1.update(dict2)
print(dict1)  # Output: {'a': 1, 'b': 3, 'c': 4}

# Using unpacking operator (Python 3.5+)
merged_dict = {**dict1, **dict2}
print(merged_dict)  # Output: {'a': 1, 'b': 3, 'c': 4}



#10. Dictionary Methods###############################################################
#Python dictionaries come with several useful methods:

#keys() – Returns all the keys of the dictionary.
#values() – Returns all the values of the dictionary.
#items() – Returns all the key-value pairs as tuples.
#get(key) – Returns the value for a specified key (or None if the key doesn’t exist).
#pop(key) – Removes the item with the specified key and returns its value.
#popitem() – Removes and returns the last inserted key-value pair.
#clear() – Removes all items from the dictionary.
#update(other_dict) – Updates the dictionary with key-value pairs from another dictionary.
#setdefault(key, default) – Returns the value of a key if it exists, else inserts the key with a default value.


#Example of Using Dictionary Methods:

my_dict = {'a': 1, 'b': 2, 'c': 3}
# Using keys()
print(my_dict.keys())  # Output: dict_keys(['a', 'b', 'c'])

# Using values()
print(my_dict.values())  # Output: dict_values([1, 2, 3])

# Using items()
print(my_dict.items())  # Output: dict_items([('a', 1), ('b', 2), ('c', 3)])

# Using setdefault()
print(my_dict.setdefault('d', 4))  # Output: 4 (d was not present, so it's added with value 4)
print(my_dict)  # Output: {'a': 1, 'b': 2, 'c': 3, 'd': 4}



#11. Performance Considerations###################################################3
#Time complexity: Lookup, insertion, and deletion of dictionary elements have an average time complexity of O(1) (constant time), making dictionaries a highly efficient data structure.
#Memory usage: Dictionaries generally consume more memory compared to other data structures (like lists), but they provide fast access to elements by key.

#Summary of Common Dictionary Operations:
#Create: my_dict = {'key': 'value'}
#Access: my_dict['key']
#Add/Update: my_dict['new_key'] = 'new_value'
#Delete: del my_dict['key']
#Check key: 'key' in my_dict
#Loop: for key, value in my_dict.items():
#Nested dict: my_dict['key1']['subkey']
#Get value safely: my_dict.get('key', 'default_value')
#Update: my_dict.update(other_dict)
#Practice Exercise:
#Create a dictionary that stores information about a book, such as title, author, publication year, and genre. Then, write code to:

#Add a new key-value pair for the publisher.
#Modify the publication year.
#Check if the genre key exists.
#Remove the publication year.
#Print all the information in a loop.
#Let me know if you'd like to see a specific example or if you have any questions about these operations!
