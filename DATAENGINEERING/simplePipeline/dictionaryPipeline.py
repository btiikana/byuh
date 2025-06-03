# Simulated raw data
raw_data = [
    {'id': 1, 'name': 'John', 'age': 28, 'city': 'New York'},
    {'id': 2, 'name': 'Alice', 'age': 24, 'city': 'Los Angeles'},
    {'id': 3, 'name': 'Bob', 'age': 35, 'city': 'Chicago'},
    {'id': 4, 'name': 'Jane', 'age': 40, 'city': 'Miami'},
]

# Data cleaning function
def clean_data(data):
    cleaned_data = []
    for record in data:
        if None not in record.values():  # Skip records with None values
            cleaned_data.append(record)
    return cleaned_data

# Data transformation function
def transform_data(data):
    transformed_data = []
    for record in data:
        record['name_upper'] = record['name'].upper()  # Adding a new field
        transformed_data.append(record)
    return transformed_data

# Data loading function
def load_data(data, filename):
    with open(filename, 'w') as f:
        # Writing the header (keys of the dictionary)
        f.write(','.join(data[0].keys()) + '\n')
        
        # Writing the data rows
        for record in data:
            f.write(','.join(str(value) for value in record.values()) + '\n')

# Main pipeline execution
cleaned_data = clean_data(raw_data)
transformed_data = transform_data(cleaned_data)
load_data(transformed_data, 'output_data.csv')