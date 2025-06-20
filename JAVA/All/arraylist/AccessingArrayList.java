import java.util.ArrayList;

public class AccessingArrayList {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<String>();// Too old, too verbose and it's been replaced
        // with .....read below..
        ArrayList<String> names = new ArrayList<>(); // <> -- Diamond Operator
        //var names = new ArrayList<>();
        names.add("Betero Tiikana");
        names.add(0,"T Tiikana");
        for (int i=0; i<names.size(); i++) {
            String name = names.get(i);
            System.out.println("Hello: " + name);
        }
        for (String personName : names) {
            System.out.println("Aloha " + personName);
        }
    }
}
