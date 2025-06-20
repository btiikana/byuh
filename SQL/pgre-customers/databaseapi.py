import os
import psycopg2
from dotenv import load_dotenv

# Load environment variables from .env file
load_dotenv()

try:
    # Connect to PostgreSQL
    conn = psycopg2.connect(
        host="localhost",
        database="Testing",     # <-- replace this
        user="postgres",         # <-- replace this
        password=os.getenv("PG_PASSWORD")
    )
    cur = conn.cursor()

    # Step 1: Create the customers table
    create_table_query = """
    CREATE TABLE IF NOT EXISTS customers (
        id SERIAL PRIMARY KEY,
        name VARCHAR(100),
        email VARCHAR(100) UNIQUE,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    """
    cur.execute(create_table_query)
    conn.commit()
    print("✅ Table 'customers' created successfully.")

    # Step 2: Insert multiple records
    insert_query = """
    INSERT INTO customers (name, email)
    VALUES (%s, %s)
    ON CONFLICT (email) DO NOTHING;
    """
    customers = [
        ("Alice Johnson", "alice@example.com"),
        ("Bob Smith", "bob@example.com"),
        ("Charlie Lee", "charlie@example.com")
    ]
    cur.executemany(insert_query, customers)
    conn.commit()
    print(f"✅ Inserted {cur.rowcount} new customer(s).")

    # Step 3: Fetch and display all customers
    cur.execute("SELECT id, name, email, created_at FROM customers;")
    rows = cur.fetchall()
    print("\n📄 All Customers:")
    for row in rows:
        print(f"ID: {row[0]}, Name: {row[1]}, Email: {row[2]}, Created At: {row[3]}")

    # Clean up
    cur.close()
    conn.close()
    print("\n✅ Connection closed.")

except Exception as e:
    print("❌ Error:", e)
