# Step 1: Read Data from a CSV file
def read_data(file_path):
    with open(file_path, 'r') as file:
        lines = file.readlines()
    header = lines[0].strip().split(',')  # Assuming CSV format with header
    data = [line.strip().split(',') for line in lines[1:]]
    return header, data

# Step 2: Process Data (e.g., filter and add a new column)
def process_data(header, data):
    # Example of processing:
    # - Filter data where the salary is greater than 50,000
    # - Add a new column "Processed" with value "Yes" if condition is met
    
    processed_data = []
    for row in data:
        salary = int(row[2])  # The Salary is the third column (index 2)
        if salary > 50000:  # Example: filter where salary > 50,000
            row.append("Yes")  # Add a new column "Processed"
            processed_data.append(row)
    
    # Add new header for the new column
    header.append("Processed")
    
    return header, processed_data

# Step 3: Write the Processed Data to a new CSV file
def write_data(file_path, header, processed_data):
    with open(file_path, 'w') as file:
        # Write header
        file.write(','.join(header) + '\n')
        
        # Write each row of processed data
        for row in processed_data:
            file.write(','.join(map(str, row)) + '\n')

# Main function to run the pipeline
def run_pipeline(input_file, output_file):
    # Read the input data
    header, data = read_data(input_file)
    
    # Process the data
    processed_header, processed_data = process_data(header, data)
    
    # Write the processed data to output file
    write_data(output_file, processed_header, processed_data)
    print(f"Data pipeline completed. Processed data saved to {output_file}.")

# Example usage with the new employee data CSV:
input_file = 'employee_data.csv'  # Path to the input file
output_file = 'processed_employee_data.csv'  # Path to the output file
run_pipeline(input_file, output_file)
