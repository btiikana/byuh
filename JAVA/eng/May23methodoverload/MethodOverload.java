import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class MethodOverload extends JPanel {

    String name;

    public MethodOverload() {
        // Constructor
        name = "Betero";
    }

    @Override
    public void paintComponent(Graphics g) {
        // Background settings
        int w = getWidth();
        int h = getWidth();

        //Draw black background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

        // Call the methods
        displayName(g, 50, 100);
        displayName(g, 0, 20, Color.YELLOW);
    }

    public void displayName(Graphics g, int x, int y) {
        displayName(g, x, y, Color.BLUE);
    }

    public void displayName(Graphics g, int x, int y, Color a) {
        g.setColor(a);
        g.drawString(name, x, y);
    }

    public static void main(String[] args) {
        var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new MethodOverload());
		window.setVisible(true);
    }
}
