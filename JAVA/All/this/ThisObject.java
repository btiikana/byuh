public class ThisObject {
    String name;
    String newName;

    public ThisObject(String name) {
        this.name = name;
    }

    public void printSelf() {
        System.out.println("My name is " + this.name);
    }

    public ThisObject rename(String newName) {
        this.newName = newName;    // Store the new name in the 'newName' field
        this.name = newName;       // Also update the main name field
        return this;               // Return the current object
    }

    public static void main(String[] args) {
        ThisObject obj = new ThisObject("Max");
        obj.printSelf(); // My name is Max

        obj.rename("Donkey");
        System.out.println("My new name is: " + obj.name); // My new name is: Donkey
    }
}
