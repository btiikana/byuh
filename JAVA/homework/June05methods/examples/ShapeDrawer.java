import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class ShapeDrawer extends JPanel {

    // Change color based on RGB values
    public void changeColor(int red, int green, int blue, Graphics g) {
        Color newColor = new Color(red, green, blue);
        g.setColor(newColor);
    }

    // Draw a triangle using 3 lines
    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

    // Draw a circle using bounding rectangle
    public void drawCircle(int xc, int yc, int r, Graphics g) {
        int topLeftX = xc - r;
        int topLeftY = yc - r;
        int diameter = 2 * r;
        g.drawOval(topLeftX, topLeftY, diameter, diameter);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a red triangle
        changeColor(255, 0, 0, g);
        drawTriangle(50, 50, 100, 150, 150, 50, g);

        // Draw a green circle
        changeColor(0, 255, 0, g);
        drawCircle(250, 100, 40, g);

        // Draw a blue triangle
        changeColor(0, 0, 255, g);
        drawTriangle(200, 200, 250, 300, 300, 200, g);

        // Draw a yellow circle
        changeColor(255, 255, 0, g);
        drawCircle(100, 250, 30, g);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Shape Drawer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new ShapeDrawer());
        window.setVisible(true);
    }
}

