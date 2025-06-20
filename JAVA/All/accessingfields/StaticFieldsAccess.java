public class StaticFieldsAccess {
    
    // Static fields (class-level variables)
    static String species = "Homo sapiens";
    static int population = 800000000;

    public static void main(String[] args) {
        // Accessing static fields directly through the class name
        System.out.println("Species: " + StaticFieldsAccess.species);  // Accessing static field 'species'
        System.out.println("Global population: " + StaticFieldsAccess.population);  // Accessing static field 'population'
        System.out.println("Species (via object): " + species);  // Accessing static field through an object
    }

}
