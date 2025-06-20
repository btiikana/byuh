import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private Duck myDuck;

    public Main() {
        myDuck = new Duck(50, 50, Color.ORANGE);

        // Demonstrating behavior
        myDuck.sayHello();     // From Bird (regular method)
        myDuck.makeSound();    // From Bird (abstract, implemented in Duck)
        myDuck.fly();          // From Flyable interface
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        myDuck.draw(g);        // Abstract method from Bird
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Duck Drawer");
        Main panel = new Main();
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
