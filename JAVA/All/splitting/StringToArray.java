public class StringToArray {

    String data;
    String[] items;

    public StringToArray() {
    data = "apple,banana,orange";
    }

    public void convertAndPrint() {
        items = data.split(","); // Convert string to array

        // Python alike for loop aka "Enhance For Loop"
        System.out.println("Turn this: " + "\n"+ items);
        System.out.println("Into this:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        StringToArray is = new StringToArray();
        is.convertAndPrint();
    }
}
