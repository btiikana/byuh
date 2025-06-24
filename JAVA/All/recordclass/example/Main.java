public class Main {
    public static void main(String[] args) {
        var h = new ElementClass("Hydrogen", 1);
        var n = new ElementClass("Nitrogen", 7);
        var he = new Element("Helium", 2);
        var he2 = new Element("Helium", 2);
        var hg = new Element("Mercury", 80);

        //compare elements using equals() method
        // if (he.equals(he2)) {
        //     System.out.println("Same same");
        // } else {
        //     System.out.println("Different");
        // }

        //compare elements using toString() method from the record class (Element)
        // System.out.println(hg);

        //getter method inside record Element class
        System.out.println("Helium's atomic number is " + he.atomicNumber());
    }
}
