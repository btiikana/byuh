import json

# Data to be written to JSON
json_data = [
    {"Name": "John", "Age": 28, "Salary": 50000},
    {"Name": "Jane", "Age": 35, "Salary": 60000},
    {"Name": "Sam", "Age": 45, "Salary": 70000},
    {"Name": "Sue", "Age": 22, "Salary": 45000},
    {"Name": "Mike", "Age": 38, "Salary": 65000},
    {"Name": "Lisa", "Age": 50, "Salary": 80000},
    {"Name": "Tom", "Age": 33, "Salary": 55000},
    {"Name": "Alice", "Age": 40, "Salary": 75000},
    {"Name": "David", "Age": 25, "Salary": 40000},
    {"Name": "Eva", "Age": 28, "Salary": 48000}
]

# Function to save the JSON data to multiple files
def save_json_files(data, file_paths):
    for file_path in file_paths:
        with open(file_path, 'w') as json_file:
            json.dump(data, json_file, indent=4)
        print(f"JSON file saved at: {file_path}")

# File paths
file_paths = [
    r'C:\Users\btiik\Desktop\FileFormats\employee_data.json',
    r'C:\Users\btiik\Desktop\FileFormats\sample_data_employee.json'
]

# Save both files
save_json_files(json_data, file_paths)
