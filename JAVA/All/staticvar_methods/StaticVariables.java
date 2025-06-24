public class StaticVariables {
    static String greeting = "Hello";  // shared by all
    String name;                       // each object has its own name

    public StaticVariables(String name) {
        this.name = name;
    }

    public void sayGreeting() {
        System.out.println(name + " says: " + greeting);
    }

    public static void main(String[] args) {
        StaticVariables a = new StaticVariables("Alice");
        StaticVariables b = new StaticVariables("Bob");
        StaticVariables c = new StaticVariables("Charlie");

        a.sayGreeting();  // Alice says: Hello
        b.sayGreeting();  // Bob says: Hello
        c.sayGreeting();  // Charlie says: Hello

        // Change static greeting using class name
        StaticVariables.greeting = "Hi";

        a.sayGreeting();  // Alice says: Hi
        b.sayGreeting();  // Bob says: Hi
        c.sayGreeting();  // Charlie says: Hi
    }
}

//Non static used example
// public class StaticVariables {
//     String greeting = "Hello";  // non-static
//     String name;

//     public StaticVariables(String name) {
//         this.name = name;
//     }

//     public void sayGreeting() {
//         System.out.println(name + " says: " + greeting);
//     }

//     public static void main(String[] args) {
//         StaticVariables a = new StaticVariables("Alice");
//         StaticVariables b = new StaticVariables("Bob");
//         StaticVariables c = new StaticVariables("Charlie");

//         // This line will cause a compile-time error:
//         StaticVariables.greeting = "Hi";  // ERROR: greeting is non-static

//         a.sayGreeting();
//         b.sayGreeting();
//         c.sayGreeting();
//     }
// }

