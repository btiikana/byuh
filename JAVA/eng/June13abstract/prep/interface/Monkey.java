public class Monkey extends Animal implements Sleep{
    //abstract method
    @Override
    public void makeNoise() {
    System.out.println("Goo goo gaga!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey is snoring,... Grrreeeeee eeeee!");
    }

}
