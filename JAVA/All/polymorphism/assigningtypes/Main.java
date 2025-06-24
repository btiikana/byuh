public class Main {

    private Animal a1, a2, a3;
    
    public Main() {
        a1 = new Cat();
        a2 = new Dog();
        a1.talk();
        a2.talk();

    //assigning new object and they become subobject of the assigner (allowed)
        // Cat a3 = new Lion();
    // what's not allowed is assigning subobject to main object (cat)
        // Lion a4 = new Cat();
    }

    public static void main(String[] args) {
        new Main();
    }
}
