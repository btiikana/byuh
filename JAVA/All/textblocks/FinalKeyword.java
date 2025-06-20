/*
Use --final-- keyword to store values that are "constants" like pi = 3.14..,
also capilatize(GOOD PRACTICE) and locate final variables in the beginning of your code for visibility.
*/

public class FinalKeyword {
    public static void main(String[] args) {
        final int NUMBER = 10;
        // number = 20; // ❌ Uncommenting this line will cause a compile-time error
        System.out.println("Final number: " + NUMBER);
    }
}

