import java.awt.Component;
import javax.swing.JOptionPane;



public class MyMessageBox {
    

    public MyMessageBox() {
        // Code initialization starts here..
        String message = """
                I love you Ruby...88888888888888888888888888888888888888
                88888888888888888888888888888888888888888888888888888888
                00000000000000000000000000000000000000000000000000000000
                """;
        JOptionPane.showMessageDialog((Component)null, message);
    }

    public static void main(String[] args) {
        new MyMessageBox();
    }

}
