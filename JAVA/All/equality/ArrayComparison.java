import java.util.Arrays;

public class ArrayComparison {

    // fields
    int[] a;
    int[] b;
    int[] c;

    // constructor
    public ArrayComparison() {
        a = new int[]{3, 1, 2, 4};

        // b points to the same array as a
        b = a;

        // c is a new array with same values as a, but different memory location
        c = new int[]{3, 1, 2, 4};
    }

    public void printComparison() {
        System.out.println("When comparing with boolean == operator, it will print:");
        System.out.println("Object: a & b & c");
        System.out.println(a == b); // true, same object reference
        System.out.println(b == c); // false, different array objects
        System.out.println("It's because == compares object memory addresses, not the values inside.");

        System.out.println("\nWhen comparing with Arrays.equals() method, it will print:");
        System.out.println("Object values: " + Arrays.toString(a) + " vs " + Arrays.toString(c));
        System.out.println(Arrays.equals(a, b)); // true, same values
        System.out.println(Arrays.equals(b, c)); // true, same values
        System.out.println("It's because Arrays.equals() compares actual values inside the arrays.");
    }

    public static void main(String[] args) {
        ArrayComparison example = new ArrayComparison();
        example.printComparison();
    }
}

