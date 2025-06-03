public class ObjFieldsAccess {

    String name;
    int age;

    // Constructor to initialize fields
    public ObjFieldsAccess(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating an object of the ObjectFieldsAccess class
        ObjFieldsAccess ObjFieldsAccess = new ObjFieldsAccess("Alice", 30);

        // Accessing fields using the object
        System.out.println("Name: " + ObjFieldsAccess.name);  // Accessing the 'name' field
        System.out.println("Age: " + ObjFieldsAccess.age);    // Accessing the 'age' field
    }
    
}
