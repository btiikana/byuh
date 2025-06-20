public class StaticVariables {
    static int a = 5;
    static int b = 10;

    public static void main(String[] args) {
        if (a < 5) {
            b += 4;
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
