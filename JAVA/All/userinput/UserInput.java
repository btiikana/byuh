import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


public class UserInput extends JPanel {
    
    String userInput;
    String secondInput;
    int age;
    ImageIcon duck;

    public UserInput() {
        // Constructor....
        duck = new ImageIcon("duck.png");
        userInput = JOptionPane.showInputDialog("Choose gender: [M]ale or [F]emale");
        if (userInput.equalsIgnoreCase("m")) {
            JOptionPane.showMessageDialog(null, "Females only");
            System.exit(0);
        }

        // call secondInput method:
        secondInput();
    }

    public void secondInput() {
        secondInput = JOptionPane.showInputDialog("How old are you: ");
        age = Integer.parseInt(secondInput);
        if (age < 18) {
            JOptionPane.showMessageDialog(null,"You have to be 18 or older to view image.");
            System.exit(0);
        }
        
    }

    public void paintComponent(Graphics g) {
        int x = 100;
        int y = 100;
        g.setColor(Color.PINK);
        g.drawString("Here is my gift to you", 50, 20);
        duck.paintIcon(null, g, x, y);

    }

    // Main Method
    public static void main(String[] args) {
        var window = new JFrame();
        window.setSize(400, 400); /* Built-in Method */
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* Built-in Method */
        window.setContentPane(new UserInput()); /* Built-in Method */
        window.setVisible(true);
    }
}