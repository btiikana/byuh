public class ExampleBreak {
    public static void main(String[] args) {
        int[] numbers = {
            1, 2, 3, 4, 5
        };
        // We are looking for 5
        int y = 5;
        for (int i=0; i<numbers.length; i++) {
            // If we find 5, program will stop the loop
            if (y == numbers[i]) {
                System.out.println("Found y or " + y + " at index: " + i);
                break;
            }
        }
    }
}
