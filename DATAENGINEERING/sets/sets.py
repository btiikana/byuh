# Sets
#A set is an unordered collection of unique items. Unlike lists and tuples, sets do not allow duplicate elements. The main properties of sets are:

# - Unordered: The items do not have a defined order.
# - No Duplicates: Sets do not allow duplicate elements.
# - Mutable: You can add and remove items.

# Creating a Set:
my_set = {1, 2, 3, 4, 5}
print(my_set)  # Output: {1, 2, 3, 4, 5}

# Operations on Sets:
# - Adding an item: You can add elements using .add().
# - Removing an item: You can remove an element using .remove() or .discard(). .remove() will raise an error if the item does not exist, while .discard() will not.
# - Set Operations: You can perform operations like union (|), intersection (&), difference (-), and symmetric difference (^).


#Example:
# Create two sets
set1 = {1, 2, 3, 4}
set2 = {3, 4, 5, 6}

# Union (combine both sets)
union_set = set1 | set2  # {1, 2, 3, 4, 5, 6}
print("Union:", union_set)

# Intersection (common items)
intersection_set = set1 & set2  # {3, 4}
print("Intersection:", intersection_set)

# Difference (items in set1 but not in set2)
difference_set = set1 - set2  # {1, 2}
print("Difference:", difference_set)
#Use Case: Sets are useful when you want to remove duplicates from a collection of data or when you need to perform mathematical operations like unions or intersections.