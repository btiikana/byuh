public class Dog extends Animal implements Noise{
    
    //defining interface method
    public void makeNoise() {
        System.out.println("Dog barks....woof woof");
    }

    public void sleep() {
        System.out.println("When dog snores it goes.....brrwoof brrwoof!");
    }

}
