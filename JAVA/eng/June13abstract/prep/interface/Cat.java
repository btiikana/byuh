public class Cat extends Animal implements Sleep{
    
    @Override
    public void makeNoise() {
        System.out.println("Meow!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is snoring,... Meeeeew!");
    }

}
