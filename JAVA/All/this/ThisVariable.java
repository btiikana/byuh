public class ThisVariable {
    String name;

    //Dog
    public ThisVariable(String name) {
        this.name = name; // this.name = field, name = parameter
        System.out.println(name); // Output: Max
    }

    public static void main(String[] args) {
        new ThisVariable("Max");
    }
}
