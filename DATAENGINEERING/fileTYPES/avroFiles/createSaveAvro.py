import fastavro
from fastavro.schema import load_schema

# Define the schema for Avro
schema = {
    "type": "record",
    "name": "Employee",
    "fields": [
        {"name": "Name", "type": "string"},
        {"name": "Age", "type": "int"},
        {"name": "Salary", "type": "int"}
    ]
}

# Data to be written to Avro
data = [
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

# Specify the file path (Desktop path for Windows)
file_paths = [r'C:\Users\btiik\Desktop\FileFormats\employee_data.avro', r'C:\Users\btiik\Desktop\FileFormats\sample_employee_data.avro']

fastavroIsGlobal = fastavro.writer

# Write data to Avro file
def saveAvroFiles(file_paths):
    for file_path in file_paths:
        with open(file_path, 'wb') as out:
            fastavroIsGlobal(out, schema, data)
        print(f"Avro file saved at: {file_path}")

saveAvroFiles(file_paths)
