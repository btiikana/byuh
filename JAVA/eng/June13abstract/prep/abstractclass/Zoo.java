public class Zoo {

    //fields
    static Elephant youngElephant;
    static Cat babyCat;

    //main method
    public static void main(String[] args) {
        youngElephant = new Elephant();
        youngElephant.makeNoise();
        babyCat = new Cat();
        babyCat.makeNoise();
    }

}