public abstract class Robot {
    protected String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello! I am " + name);
    }

    // Abstract method – must be implemented by subclasses
    public abstract void move();
}
