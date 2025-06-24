public class Cat extends Animal implements Noise {
    
    //defining interface method
    public void makeNoise() {
        System.out.println("Cat meows.....meow meow");
    }

    public void sleep() {
        System.out.println("When cat snores it goes.....prrrzzzz!");
    }
}
