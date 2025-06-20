import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

public class AsteroidB612 extends JPanel {
	
	//int dy;
	ImageIcon lamb;
	String sheepPosition;
	String[] row1;
	Point[] stars;
	LittlePrince keena;
	LittlePrince neneka;
	LittlePrince alphea;

	public AsteroidB612() {
		keena = new LittlePrince();
		neneka = new LittlePrince(-100, 20);
		alphea = new LittlePrince(100, -30, Color.RED);
	}
	
	public void refrain() {
		System.out.println("Happy birthday to you!");
	}
	
	public void singHappyBirthday(String name) {
		refrain();
		refrain();
		System.out.println("Happy birthday dear " + name + "!");
		refrain();
	}
	
	public double getCircleArea(double r) {
		double kenneth = Math.PI * r * r;
		return kenneth;
	}
	
	@Override
	public void paintComponent(Graphics g) {		
		var w = getWidth();
		var h = getHeight();
		
		//first, draw the infinite inky blackness of outer space
		g.setColor(Color.BLACK);
		g.fillRect(0,0,w,h);
		
		g.setColor(Color.WHITE);
		
		//next, draw a big oval for the asteroid
		g.setColor(Color.GRAY);
		g.fillOval(-100, 250, 600, 600);
		
		keena.draw(g);
		neneka.draw(g);
		alphea.draw(g);

	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AsteroidB612());
		window.setVisible(true);
	}
}
