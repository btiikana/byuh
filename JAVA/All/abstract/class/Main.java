import javax.swing.*;
import java.awt.*;

// Main class to run and draw the Duck
public class Main extends JPanel {
    private Duck myDuck;

    public Main() {
        // Create a Duck with coordinates and color
        myDuck = new Duck(50, 50, Color.ORANGE);
    }

    // Draw the duck using the Duck class's method
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        myDuck.draw(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Duck Drawing");
        Main panel = new Main();
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

