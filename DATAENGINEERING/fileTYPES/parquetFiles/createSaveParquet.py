import pandas as pd

# Sample data for Parquet file
data = {
    'Name': ['John', 'Jane', 'Sam', 'Sue', 'Mike', 'Lisa', 'Tom', 'Alice', 'David', 'Eva'],
    'Age': [28, 35, 45, 22, 38, 50, 33, 40, 25, 28],
    'Salary': [50000, 60000, 70000, 45000, 65000, 80000, 55000, 75000, 40000, 48000]
}

# Create DataFrame
df = pd.DataFrame(data)

# Specify the file path (Desktop path for Windows)
file_paths = [r'C:\Users\btiik\Desktop\FileFormats\employee_data.parquet', r'C:\Users\btiik\Desktop\FileFormats\sample_employee_data.parquet']

# Write to Parquet
def saveParquetFiles(df, file_paths):
    for file_path in file_paths:
        df.to_parquet(file_path, engine='pyarrow')
        print(f"Parquet file saved at: {file_path}")

saveParquetFiles(df, file_paths)

