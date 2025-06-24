public class PersonComparison3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3("Betero");
        Person3 p2 = new Person3("Betero");

        System.out.println(".equals() with override:");
        System.out.println(p1.equals(p2)); // true – compares values
    }
}

// With proper override
class Person3 {
    String name;

    public Person3(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person3 other = (Person3) obj;
        return this.name.equals(other.name);
    }
}

