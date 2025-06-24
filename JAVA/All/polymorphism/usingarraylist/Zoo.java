import java.util.ArrayList;

public class Zoo {
    
    public Zoo() {
        // var cats = new ArrayList<Cat>();
        // var elephants = new ArrayList<Elephant>();
        // var dogs = new ArrayList<Dog>();
        // for (int i=0; i<50; i++) {
        //     cats.add(new Cat());
        //     elephants.add(new Elephant());
        //     dogs.add(new Dog());
        // }

        // for (var a : cats) {
        //     feed(a);
        // }

        // for (var a : elephants) {
        //     feed(a);
        // }

        // for (var a : dogs) {
        //     feed(a);
        // }

        //polymorphism used
        var animals = new ArrayList<Animal>();
        for (int i=0; i<50; i++) {
            animals.add(new Cat());
            animals.add(new Elephant());
            animals.add(new Dog());
        }

        for (var a : animals) {
            feed(a);
        }
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

    //polymorphism used
    public void feed(Animal a) {
        a.eat();
        a.makeNoise();
    }

    public static void main(String[] args) {
        new Zoo();
    }
}
