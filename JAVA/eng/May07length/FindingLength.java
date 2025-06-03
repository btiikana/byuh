public class FindingLength {
    /* Working with length() method. */
    String kaleb = "Go";
    String keena = "BYUH";
    String concatenate = kaleb + " " + keena;


    public static void main(String[] args) {
        FindingLength obj = new FindingLength();

        System.out.println("Kaleb says:" + obj.kaleb);
        System.out.println("Keena says:" + obj.keena);
        System.out.println("Kaleb and Keena both say:" + obj.concatenate);
        System.out.println("The charact length of what they say is: " + obj.concatenate.length());
    }
    
}
