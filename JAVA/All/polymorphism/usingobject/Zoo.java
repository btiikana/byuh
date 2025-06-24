import java.util.ArrayList;

public class Zoo {
    
    public Zoo() {

        // //polymorphism used (ArrayList)
        // var animals = new ArrayList<Animal>();
        // for (int i=0; i<50; i++) {
        //     animals.add(new Cat());
        //     animals.add(new Elephant());
        //     animals.add(new Dog());
        // }

        // for (var a : animals) {
        //     feed(a);
        // }

        //polymorphism used (object)
        int r = (int)(Math.random()*3+1);
        Animal a = null;
        if (r == 1) {
            a = new Cat();
        } else if (r == 2) {
            a = new Elephant();
        } else {
            a = new Dog();
        }
        feed(a);
    }

    public void feed(Animal a) {
        a.eat();
        a.makeNoise();
    }

    public static void main(String[] args) {
        new Zoo();
    }
}
