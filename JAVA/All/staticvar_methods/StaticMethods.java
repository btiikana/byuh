public class StaticMethods {

    // Static method
    public static void sayHello() {
        System.out.println("Hello from a static method!");
    }

    public static void sayHola() {
        System.out.println("Hola, como esta from a static method!?");
    }

    public static void main(String[] args) {
        // Call the static method using the class name
        StaticMethods.sayHello();  // Output: Hello from a static method!
        StaticMethods.sayHola(); //Output: Hola from a static method as well!
    }
}

