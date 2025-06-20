public abstract class Animal {
    private int weight; // in kg

    public void eat() {
        weight++;
    }

    public void makeNoise() {
        System.out.println("Note to self: subclasses should override this method");
    }
}
