import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private Duck myDuck;

    public Main() {
        myDuck = new Duck(50, 50, Color.ORANGE);
        myDuck.makeSound();  // Calling the abstract method implemented by Duck
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        myDuck.draw(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Duck Drawing");
        Main panel = new Main();
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
