public abstract class Animal {
    private int weight; // in kg

    public void eat() {
        weight++;
    }

    public abstract void makeNoise();
}
