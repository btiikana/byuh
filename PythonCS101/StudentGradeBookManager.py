import json
import os

defaultFileName = "gradebook.json"
gradeBook = {}

def loadGradeBook():
    global gradeBook
    if os.path.exists(defaultFileName):
        with open(defaultFileName, 'r') as file:
            try:
                gradeBook = json.load(file)
                for student in gradeBook:
                    gradeBook[student] = [float(g) for g in gradeBook[student]]
            except json.JSONDecodeError:
                print("⚠️ Could not read gradebook file. Starting with an empty one.")
    else:
        gradeBook = {}

def saveGradeBook(fileName=defaultFileName):
    with open(fileName, 'w') as file:
        json.dump(gradeBook, file)
    print(f"💾 Gradebook saved to '{fileName}'.")

def addStudent():
    name = input("Enter student name: ").strip().title()
    if name in gradeBook:
        print(f"❗ {name} already exists.")
    else:
        gradeBook[name] = []
        print(f"✅ {name} has been added to the gradebook.")

def addGrade():
    name = input("Enter student name: ").strip().title()
    if name in gradeBook:
        try:
            gradesInput = input("Enter grade(s) separated by commas (e.g., 85, 90, 78): ")
            grades = [float(g.strip()) for g in gradesInput.split(',')]
            if any(g < 0 for g in grades):
                print("❗ Grades cannot be negative.")
                return
            gradeBook[name].extend(grades)
            print(f"✅ Added {len(grades)} grade(s) to {name}.")
        except ValueError:
            print("❗ Invalid input. Please enter numbers only.")
    else:
        print(f"❗ {name} not found in the gradebook.")

def viewStudent():
    name = input("Enter student name: ").strip().title()
    if name in gradeBook:
        grades = gradeBook[name]
        if grades:
            avg = sum(grades) / len(grades)
            print(f"📋 {name}'s Grades: {grades}")
            print(f"📊 Average: {avg:.2f}")
        else:
            print(f"📋 {name} has no grades yet.")
    else:
        print(f"❗ {name} not found.")

def viewAll():
    if not gradeBook:
        print("📭 No students in the gradebook.")
        return
    
    sortedStudents = sorted(
        gradeBook.items(), 
        key=lambda item: sum(item[1]) / len(item[1]) if item[1] else 0, 
        reverse=True
    )

    print("\n📚 All Students and Their Averages:")
    for student, grades in sortedStudents:
        avg = sum(grades) / len(grades) if grades else 0
        print(f"👤 {student}: Grades = {grades}, Average = {avg:.2f}")

def removeStudent():
    name = input("Enter student name to remove: ").strip().title()
    if name in gradeBook:
        del gradeBook[name]
        print(f"🗑️ {name} has been removed from the gradebook.")
    else:
        print(f"❗ {name} not found.")

def manualSave():
    saveGradeBook()

def saveAs():
    newFileName = input("Enter new filename (e.g., my_grades.json): ").strip()
    if not newFileName.endswith('.json'):
        newFileName += '.json'
    saveGradeBook(newFileName)

def main():
    loadGradeBook()
    while True:
        print("\n--- 📘 Gradebook Menu ---")
        print("1. Add Student")
        print("2. Add Grade(s)")
        print("3. View a Student's Grades")
        print("4. View All Students and Averages")
        print("5. Remove Student")
        print("6. Save")
        print("7. Save As")
        print("8. Exit")
        
        choice = input("👉 Choose an option (1-8): ")
        
        if choice == '1':
            addStudent()
        elif choice == '2':
            addGrade()
        elif choice == '3':
            viewStudent()
        elif choice == '4':
            viewAll()
        elif choice == '5':
            removeStudent()
        elif choice == '6':
            manualSave()
        elif choice == '7':
            saveAs()
        elif choice == '8':
            print("👋 Exiting Gradebook Manager. Goodbye!")
            break
        else:
            print("❗ Invalid option. Please select a number from 1 to 8.")

if __name__ == "__main__":
    main()
