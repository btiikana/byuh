import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;

public class CreatingMethods extends JPanel {

    ImageIcon heart;
    ImageIcon duck;
	
	public CreatingMethods() {
        heart = new ImageIcon("heart1.png");
        duck = new ImageIcon("duck.png");
    }

	@Override
	public void paintComponent(Graphics g) {
        // Background Settings
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

        // call methods within paintComponent() and pass values to every method called.
        drawSheep(g, -10, 8);
        drawSheep(g, 70, -148);
        drawHeart(g, 20, 40);
        drawHeart(g, 285, 260);
        drawDuck(g, 240, 50);
        drawDuck(g, 140, 210);
	}

    public void drawSheep(Graphics g,int x, int y) /*Receives values from drawsheep() method inside paintComponent() */ {

		/* Set Sheep's color */
		g.setColor(Color.RED);

		/*Draw Sheep's Head */
		g.fillOval(x + 75, 200+ y, 225, 100 );
		g.fillOval(x + 50, 150+ y, 75, 75);

		/* Draw Sheep's Legs */
		g.fillRect(x + 100, 250+ y, 25, 100);
		g.fillRect(x + 150, 250+ y, 25, 100);
		g.fillRect(x + 200, 250+ y, 25, 100);
		g.fillRect(x + 250, 250+ y, 25, 100);
    }

    public void drawHeart(Graphics g, int x, int y) {
        heart.paintIcon(null, g, x, y);
    }

    public void drawDuck(Graphics g, int x, int y) {
        duck.paintIcon(null, g, x, y);
    }

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new CreatingMethods());
		window.setVisible(true);
	}
}
