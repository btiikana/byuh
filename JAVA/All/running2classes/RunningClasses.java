public class RunningClasses {

    String name;
    int age;

    // Constructor to initialize fields
    public RunningClasses(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRunningClasses() {
        System.out.println("Name" + name);
        System.out.println("Age" + age);
    }

    public static void main(String[] args) {
        // Creating an object of the ObjectFieldsAccess class
        RunningClasses obj = new RunningClasses("Alice", 30);

        // Accessing fields using the object
        obj.displayRunningClasses();
        StaticFieldsAccess.displayStaticFieldsAccess();
    }
    
}

// Source code is decompiled from a .class file using FernFlower decompiler.
class StaticFieldsAccess {
    static String species = "Homo sapiens";
    static int population = 800000000;

    public static void displayStaticFieldsAccess() {
        System.out.println("Species" + species);
        System.out.println("Population" + population);
    }
    
}
