import javax.swing.JFrame; 
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class PassThrough extends JPanel {

    public PassThrough() {
    }

    @Override
    public void paintComponent(Graphics g) {
        //Panel total width and height
        int w = getWidth();
        int h = getHeight();

        //Set Background Color to Black
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

        //Call Methods and Pass Values
        drawSheep(g, 0, 0);                  // Default: draws blue sheep
        drawSheep(g, 100, 200, Color.WHITE); // Draws white sheep
    }

    // Default: blue sheep
    public void drawSheep(Graphics g, int x, int y) {
        drawSheep(g, x, y, Color.BLUE);  // Pass-through to main method
    }

    // General sheep drawing method
    public void drawSheep(Graphics g, int x, int y, Color a) {
        g.setColor(a);
        g.fillOval(x + 50, y + 150, 75, 75);     // Head
        g.fillOval(x + 75, y + 200, 225, 100);   // Body
        g.fillRect(x + 100, y + 250, 25, 100);   // Leg 1
        g.fillRect(x + 150, y + 250, 25, 100);   // Leg 2
        g.fillRect(x + 200, y + 250, 25, 100);   // Leg 3
        g.fillRect(x + 250, y + 250, 25, 100);   // Leg 4
    }

    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 600);
        window.setContentPane(new PassThrough());
        window.setVisible(true);
    }
}
