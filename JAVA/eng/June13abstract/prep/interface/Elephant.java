public class Elephant extends Animal implements Sleep{
    
    @Override
    public void makeNoise() {
        System.out.println("Trumpet!!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is snoring,... Pooooooooooo!");
    }

}
