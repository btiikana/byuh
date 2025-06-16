public class Zoo {

    //fields
    static Elephant youngElephant;
    static Cat babyCat;
    static Monkey funnyMonkey;

    //main method
    public static void main(String[] args) {
        youngElephant = new Elephant();
        youngElephant.makeNoise();
        babyCat = new Cat();
        babyCat.makeNoise();
        funnyMonkey = new Monkey();
        funnyMonkey.makeNoise();

    }

}