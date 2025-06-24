public class Zoo {
    
    public Zoo() {
        // Cat a1 = new Cat();
        // Elephant a2 = new Elephant();
        // Dog a3 = new Dog();
        // feed(a1);
        // feed(a2);
        // feed(a3);

        //polymorphism used
        Cat a1 = new Cat();
        Elephant a2 = new Elephant();
        Dog a3 = new Dog();
        feed(a1);
        feed(a2);
        feed(a3);
    }

    // //feed cat
    // public void feed(Cat a) {
    //     a.eat();
    //     a.makeNoise();
    // }

    // //feed elephant
    // public void feed(Elephant a) {
    //     a.eat();
    //     a.makeNoise();
    // }

    // public void feed(Dog a) {
    //     a.eat();
    //     a.makeNoise();
    // }

    public void feed(Animal a) {
        a.eat();
        a.makeNoise();
    }

    public static void main(String[] args) {
        new Zoo();
    }
}
