public class Main {

    //fields
    private Cat cat;
    private Dog dog;
    
    //default constructor
    public Main() {
        cat = new Cat();
        dog = new Dog();
    }

    public void animalBehavior() {
        cat.makeNoise();
        dog.makeNoise();
        cat.sleep();
        dog.sleep();
        dog.wiggleTail();
    }

    //Main method
    public static void main(String[] args) {
        Main program = new Main();
        program.animalBehavior();
    }
}
