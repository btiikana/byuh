public abstract class Animal {
    
    //fields
    int weight; //in kg

    //regular method
    public void eat() {
        weight++;
    }

    public abstract void makeNoise();
}
