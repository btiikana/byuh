public class Zoo {

    //fields
    static Elephant youngElephant;
    static Cat babyCat;
    static Monkey funnyMonkey;

    //main method
    public static void main(String[] args) {
        youngElephant = new Elephant();
        youngElephant.makeNoise();
        youngElephant.sleep();
        babyCat = new Cat();
        babyCat.sleep();
        babyCat.makeNoise();
        funnyMonkey = new Monkey();
        funnyMonkey.sleep();
        funnyMonkey.makeNoise();
    }

}