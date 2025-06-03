import javax.swing.JOptionPane;
import java.awt.Component;

// Multi Dimensional and Accessing index
public class MultiDimArray {

    String[][] names;
    String smith;
    String jones;
    String mrSmith;
    String msJones;
    String message;
    String combine;

    public void array2D() {
        names = new String[][]{
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        smith = names[0][0] + names[1][0];
         // Ms. Jones
        jones = names[0][2] + names[1][1];
        message = smith + "\n" + jones;
        System.out.println("Print in the console: " + "\n" + message);
    }

// We can have 3D Array too....

    public void array3D() {
            String[][][] names = {
                {
                    {"Mr. ", "Mrs. ", "Ms. "},
                    {"Smith", "Jones"}
                }
            };
            // Mr. Smith
            mrSmith = names[0][0][0] + names[0][1][0];
            // Ms. Jones
            msJones = names[0][0][2] + names[0][1][1];
            combine = mrSmith + "\n" + msJones;
            // print in console
            
            JOptionPane.showMessageDialog((Component)null, combine);
        }

    public static void main(String[] args) {
        MultiDimArray obj = new MultiDimArray();
        obj.array2D();
        obj.array3D();
    }
}

