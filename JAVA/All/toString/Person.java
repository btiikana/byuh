public class Person {
    String name;
    int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    @Override
    public String toString() {
        return "num: " + name + ", age: " + age;
    }

    public static void main(String[] args) {
        Person p = new Person("Betero", 25);
        System.out.println(p);  // Automatically calls toString()
    }
}

