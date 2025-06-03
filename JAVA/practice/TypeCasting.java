// Converting Types

public class TypeCasting {
    
    double a;
    int i;
    double b;
    boolean married;
    char middleInitial;
    String greet;
    double int2Double;
    int double2Int;
    double result;

    public TypeCasting() {
    a = 20.0;
    i = 6;
    b = 5.0;
    married = true;
    middleInitial = 'T';
    greet = "Hello There!";

    /* Converting int to double */
    int2Double = (double)a;

    /* Converting double to int */
    double2Int = (int)b;

    /* Testing dividing int variables */
    result = a / i;
    }

    public void display() {
        System.out.println(int2Double);
        System.out.println(double2Int);
        System.out.println(married);
        System.out.println(middleInitial);
        System.out.println(greet);
        System.out.println(result);
    }


    public static void main(String[] args) {
        // Creating an object to access class variables
        TypeCasting obj = new TypeCasting();
        obj.display();
    }
}
