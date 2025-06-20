import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

// Rubric
/*
Explain the meaning of each of the parameters in the drawOval (or fillOval) method. (3 points)
Explain the meaning of each of the parameters in the drawRect (or fillRect) method. (3 points)
Explain what shapes you used to build each part of your scene. (3 points)
Describe your source code, explaining which sections of code draw which parts of the scene. (4 points)
Demonstrate that land, sky, and vegetation are visible. (2 points)
Demonstrate that your pyramid has at least 4 layers, and stairs. (2 points)
Show that there is a sign in front of your pyramid, with the words (Your Name)'s Pyramid on it. (2 points)
Show that there are three fluffy clouds (not simple ovals) in the sky. (2 points)
Show that you can change one line of code to make your pyramid float 50 pixels above its previous position. (4 points)
Show that each major section of the program is commented. (1 point)
Show that your source code is neatly and consistently indented. (1 point)
Show that all your variable and method names start with a lowercase letter. (1 point)
Show that all your class names start with an uppercase letter. (1 point)
You uploaded a screenshot to Canvas. (1 point)
 */

public class Pyramid extends JPanel {
    
    public void pyramid() {
        // Constructor
    }

        // THIS IS OUR FIRST METHOD
    @Override
    public void paintComponent(Graphics g) {
        var width = getWidth();
        var height = getHeight();
        // Suspend Pyramid
        var suspend = -10;

        // Background
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, width, height);

        // Sun
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 60, 60);

        // Cloud 1
        g.setColor(Color.WHITE);
        g.fillOval(100, 10, 50, 20);
        g.fillOval(120, 10, 50, 10);

        // Cloud 2
        g.fillOval(200, 10, 50, 20);
        g.fillOval(220, 10, 50, 10);

        // Cloud 3
        g.fillOval(300, 10, 50, 20);
        g.fillOval(320, 10, 50, 10);

        // Mountains
        g.setColor(Color.GREEN);
        g.fillRect(0, 170, width, height);
        g.fillOval(-20, 120, 180, 100);

        // Vegetation
        g.fillRect(200, 150, 20, 70);
        g.fillRect(250, 150, 20, 70);
        g.fillRect(300, 150, 20, 70);
        g.fillRect(350, 150, 20, 70);

        //Airplane
        g.setColor(Color.WHITE);
        g.fillRect(250, 70, 100, 20);
        g.fillRect(240, 60, 10,20);
        g.fillRect(289, 60, 10,20);
        g.setColor(Color.ORANGE);
        g.fillRect(350, 70, 10,20);
        // Trail and Seasider
        g.setColor(Color.WHITE);
        g.fillRect(200, 70, 5,5);
        g.fillRect(210, 70, 5,5);
        g.fillRect(220, 70, 5,5);
        g.fillRect(230, 70, 5,5);
        g.fillRect(100, 70, 100,40);
        g.setColor(Color.RED);
        g.drawString("GO SEASIDER!!", 105, 90);

        // Ground
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 300, width, height);

        //pyramid
        g.setColor(Color.ORANGE);
        g.fillRect(140, 180 + suspend, 90, 40 + suspend);
        g.fillRect(120, 210 + suspend, 130, 60 + suspend);
        g.fillRect(100, 230 + suspend, 170, 80 + suspend);
        g.fillRect(80, 250 + suspend, 210, 50 + suspend);
        g.fillRect(60, 270 + suspend, 250,40 + suspend);
        g.setColor(Color.BLACK);
        g.drawOval(148, 185 + suspend, 75, 30 + suspend);
        // Stairs
        g.drawLine(180, 250 + suspend, 200, 250 + suspend);
        g.drawLine(160, 260 + suspend, 220, 260 + suspend);
        g.drawLine(140, 270 + suspend, 240, 270 + suspend);
        g.drawLine(120, 280 + suspend, 260, 280 + suspend);
        g.drawLine(110, 290 + suspend, 270, 290 + suspend);
        g.drawLine(100, 300 + suspend, 280, 300 + suspend);

        // My name
        g.setColor(Color.WHITE);
        g.fillRect(150, 320, 80, 35);
        g.setColor(Color.BLACK);
        g.drawString("Betero Tiikana", 150, 340);
    }
    // THIS IS OUR MAIN METHOD
    public static void main(String[] args) {
        var window = new JFrame();

        window.setSize(400, 400); /* Built-in Method */
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* Built-in Method */
        window.setContentPane(new Pyramid()); /* Built-in Method */
        window.setVisible(true);
    }
}
