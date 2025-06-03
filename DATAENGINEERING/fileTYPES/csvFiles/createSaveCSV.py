import csv

# Define the data for CSV
csv_data = [
    ["Name", "Age", "Salary"],
    ["John", 28, 50000],
    ["Jane", 35, 60000],
    ["Sam", 45, 70000],
    ["Sue", 22, 45000],
    ["Mike", 38, 65000],
    ["Lisa", 50, 80000],
    ["Tom", 33, 55000],
    ["Alice", 40, 75000],
    ["David", 25, 40000],
    ["Eva", 28, 48000]
]

# Specify the file path (Desktop path for Windows)
file_paths = [r'C:\Users\btiik\Desktop\FileFormats\employee_data.csv', r'C:\Users\btiik\Desktop\FileFormats\sample_employee_data.csv']

# Write data to CSV
def saveCSVFiles(data, file_paths):
    for file_path in file_paths:
        with open(file_path, mode='w', newline='') as file:
            writer = csv.writer(file)
            writer.writerows(data)
        print(f"CSV file saved at: {file_path}")

saveCSVFiles(csv_data, file_paths)
