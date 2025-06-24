public class ElementClass {
    private String name;
    private int atomicNumber;

    public ElementClass(String n, int a) {
        name = n;
        atomicNumber = a;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", atomicNumber: " +
                atomicNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ElementClass other) {
            return (this.name.equals(other.name))
            && (this.atomicNumber == other.atomicNumber);
        }
        return false;
    }
}
