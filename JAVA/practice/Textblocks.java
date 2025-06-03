import java.awt.Component;
import javax.swing.JOptionPane;

public class Textblocks {

    String showMessage;
    String greet;

    public Textblocks() {
        greet = """
        Hello Tione, Welcome home Son!
        Hello Destiny, Welcome home Daughter!
        """;
    }

    public void display() {
        JOptionPane.showMessageDialog((Component)null, greet);
    }

    public static void main(String[] args) {
        Textblocks s = new Textblocks();
        s.display();
    }
}
