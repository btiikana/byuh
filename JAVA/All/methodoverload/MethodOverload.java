import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MethodOverload extends JPanel {
	public MethodOverload() {
	}

	@Override
	public void paintComponent(Graphics g) {
        //Background settings
        int w = getWidth();
        int h = getHeight();

        //Draw black background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

        //Call drawSheep methods
        colorSheep(g, Color.RED, "Betero Tiikana");
        colorSheep(g, Color.WHITE);
        colorSheep(g, Color.BLUE, 300);
	}

    //Coloring the sheep Red -- Main difference is the name variable
    public void colorSheep(Graphics g, Color a, String name) {
        int x = -55;
        int y = -100;

        g.setColor(a);
        g.drawString(name, 300, 30);
        /*Draw Sheep's Head */
        g.fillOval(x + 50, y + 150, 75, 75);
        /*Draw Sheep's Body */
		g.fillOval(x + 75, y + 200, 225, 100);
		/* Draw Sheep's Legs */
		g.fillRect(x + 100, y + 250, 25, 100);
		g.fillRect(x + 150, y + 250, 25, 100);
		g.fillRect(x + 200, y + 250, 25, 100);
		g.fillRect(x + 250, y + 250, 25, 100);

    }
    //Coloring the sheep White -- Main difference is there are only two parameters
    public void colorSheep(Graphics g, Color b) {
        int x = 10;
        int y = 200;

        g.setColor(b);
        /*Draw Sheep's Head */
        g.fillOval(x + 50, y + 150, 75, 75);
        /*Draw Sheep's Body */
		g.fillOval(x + 75, y + 200, 225, 100);
		/* Draw Sheep's Legs */
		g.fillRect(x + 100, y + 250, 25, 100);
		g.fillRect(x + 150, y + 250, 25, 100);
		g.fillRect(x + 200, y + 250, 25, 100);
		g.fillRect(x + 250, y + 250, 25, 100);
    }
    //Coloring the sheep Blue -- Main difference is the offSet Variable
    public void colorSheep(Graphics g, Color c, int dx) {
        int y = 200;

        g.setColor(c);
        /*Draw Sheep's Head */
        g.fillOval(dx + 50, y + 150, 75, 75);
        /*Draw Sheep's Body */
        g.fillOval(dx + 75, y + 200, 225, 100);
		/* Draw Sheep's Legs */
		g.fillRect(dx + 100, y + 250, 25, 100);
		g.fillRect(dx + 150, y + 250, 25, 100);
		g.fillRect(dx + 200, y + 250, 25, 100);
		g.fillRect(dx + 250, y + 250, 25, 100);
    }

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(700,700);
		window.setContentPane(new MethodOverload());
		window.setVisible(true);
	}
}