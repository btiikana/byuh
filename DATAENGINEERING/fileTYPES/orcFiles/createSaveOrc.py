import pyorc

# Data to write to ORC
data = [
    ("John", 28, 50000),
    ("Jane", 35, 60000),
    ("Sam", 45, 70000),
    ("Sue", 22, 45000),
    ("Mike", 38, 65000),
    ("Lisa", 50, 80000),
    ("Tom", 33, 55000),
    ("Alice", 40, 75000),
    ("David", 25, 40000),
    ("Eva", 28, 48000)
]

# Define schema for ORC
schema = """
struct<
    Name: string,
    Age: int,
    Salary: int
>
"""

# Specify the file path (Desktop path for Windows)
file_paths = [r'C:\Users\btiik\Desktop\FileFormats\employee_data.orc', r'C:\Users\btiik\Desktop\FileFormats\sample_employee_data.orc']

# Write to ORC file
def saveORCFiles(file_paths):
    for file_path in file_paths:
        with open(file_path, 'wb') as f:
            with pyorc.Writer(f, schema) as writer:
                for row in data:
                    writer.write(row)
        print(f"ORC file saved at: {file_path}")

saveORCFiles(file_paths)
