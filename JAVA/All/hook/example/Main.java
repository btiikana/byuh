public class Main {
    public static void main(String[] args) {
        Phone android = new AndroidPhone();
        android.powerOn();

        Phone flip = new FlipPhone();
        flip.powerOn();
    }
}
