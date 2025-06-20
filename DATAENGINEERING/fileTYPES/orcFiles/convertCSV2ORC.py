import pandas as pd
import pyorc

# Read the CSV file into a pandas DataFrame
data = pd.read_csv("employee_data_orc.csv")

# Define the ORC schema
schema = pyorc.TypeDescription.from_string("""
struct<
    Name: string,
    Age: int,
    Salary: int
>
""")

# Convert to ORC and save to file
with open("employee_data.orc", 'wb') as f:
    with pyorc.Writer(f, schema) as writer:
        for _, row in data.iterrows():
            writer.write((row['Name'], row['Age'], row['Salary']))

print("ORC file saved as employee_data.orc")
