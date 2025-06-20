import java.util.ArrayList;

public class ThreeValidWays {
    
    ArrayList<String> arr;
    ArrayList<String> names;
    ArrayList<String> list;


    //Constructor
    public ThreeValidWays() {
        //1. Using Longer syntax to declare --ArrayList<String> = ArrayList<String>();
        arr = new ArrayList<String>();
        arr.add("Hello");
        arr.add("World");

        //2. Using Shorter Syntax to declare --Diamond Operator--
        names = new ArrayList<>();
        names.add("Betero Tiikana");
        names.add("T Tiikana");

        //3. Using Shortcut Syntax to declare --var--
        list = new ArrayList<String>();
        list.add("One");
        //set() -- replaces an item.
        list.set(0, "Zero");
        list.add("One");
    }

    //Printer
    public void print() {
        // arr list
        for (String word : arr) {
            System.out.println("Print arr-list items: " + word);
        }

        // names list
        for (int i=0; i<names.size(); i++) {
            var displayNames = names.get(i);
            System.out.println("Print Names " + displayNames);
        }

        // list
        int count = 0;
        do {
            System.out.println("Print Numbers in String Format : " + list.get(count));
            count++;
        } while (count < list.size());
    }

    public static void main(String[] args) {
        ThreeValidWays obj = new ThreeValidWays();
        obj.print();
    }
}
