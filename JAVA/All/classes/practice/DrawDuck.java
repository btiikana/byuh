import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;

public class DrawDuck extends JPanel {

    ImageIcon duck;
	
	public DrawDuck() {
        duck = new ImageIcon("duck.png");
	}

    public void draw(Graphics g, Position v) {
        duck.paintIcon(null, g, v.x, v.y);
        g.setColor(Color.RED);
        g.drawString("First Duck drawn!", 0, 100);

    }

    public void draw(Graphics g, Position v, Color c) {
        //move duck to the right
        draw(g, v);
        g.setColor(c);
        g.drawString("This is the seond duck!", 60, 220);
    }

	@Override
	public void paintComponent(Graphics g) {
        //Background Color and size
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        //create objects
        Position pos = new Position(10, 100);
        Position pos2 = new Position(80, 100);
        //Call method
        draw(g, pos);
        draw(g, pos2, Color.WHITE);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new DrawDuck());
		window.setVisible(true);
	}
}
