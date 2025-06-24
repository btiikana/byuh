import java.util.ArrayList;

public class ArrayListComparison {

    //fields
    ArrayList<String> abc;
    ArrayList<String> def;
    ArrayList<String> ghi;

    public ArrayListComparison () {
        abc = new ArrayList<String>();
        abc.add("Hello");
        abc.add(" " + "World");

        //creating same object, def points at same location
        def = abc;

        //ghi is a new object, not pointing at abc object
        ghi = new ArrayList<String>();
        ghi.add("Hello");
        ghi.add(" " + "World");
    }

    public void printComparison() {
        //== is used to compared the object in a location not what the object stores
        System.out.println("When comparing with boolean == operator, it will print: ");
        System.out.println("Object: " + "abc & def & ghi");
        System.out.println(abc == def);
        System.out.println(def == ghi);
        System.out.println("It's because objects are compared not values inside the object");

        //.equals() compares the values that the object stores
        System.out.println("When comparing with .equals()method, it will print: ");
        System.out.println("Object values are : " + abc + def);
        System.out.println(abc.equals(def));
        System.out.println(ghi.equals(def));
        System.out.println("It's because values are compared that are stored in the objects");
    }

    //compare each in main method
    public static void main(String[] args) {
        ArrayListComparison print = new ArrayListComparison();
        print.printComparison();
    }
}