import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Component;

public class FunDuck extends JPanel {

    ImageIcon duck;
    String userInput;

    public FunDuck() {
        duck = new ImageIcon("duck.png");
        userInput = JOptionPane.showInputDialog("Do you want a gift: Choose [Y]es or [N]o");

        if (userInput != null && userInput.trim().toLowerCase().startsWith("Y")) {
            //continue is invalid, program continues when left empty here.
        } else if (userInput != null && userInput.trim().equalsIgnoreCase("n")) {
            JOptionPane.showMessageDialog(null, "Sorry that we don't have what you like.");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null,"Check your answer and try again!");
            System.exit(0);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call superclass method first

        // Background settings
        int w = getWidth();
        int h = getHeight();

        // Draw background gray
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, w, h);

        // Create object
        xYPosition pos = new xYPosition(100, 200);

        // Call method
        drawDuck(g, pos, duck);
    }

    public void drawDuck(Graphics g, xYPosition pos, ImageIcon duck) {
        g.setColor(Color.BLACK);
        g.drawString("Your duck is drawn!", 200, 200);
        duck.paintIcon(pos, g, pos.x, pos.y); // Correct method signature
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new FunDuck());
        window.setVisible(true);
    }

    // Inner class for position (assuming you need it)
    static class xYPosition extends Component {
        int x, y;

        public xYPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
