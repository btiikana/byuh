import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

//Name: Betero Tiikana
//Course: CS 202

//PART 1

public class MethodsLab1 extends JPanel {

	public MethodsLab1() {
	}

	public void backgroundSettings(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.BLACK);
	}

	//method to change color
    public void changeColor(int red, int green, int blue, Graphics g) {
		Color newColor = new Color(red, green, blue);
		g.setColor(newColor);
    }

    //method to draw triangle
    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g) {
		g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

    //method to draw circle
    public void drawCircle(int xc, int yc, int r, Graphics g) {
		int x = xc - r;
		int y = yc - r;
		int size = 2 * r;
		g.drawOval(x, y, size, size);
    }

	@Override
	public void paintComponent(Graphics g) {
	/*CALL METHODS HERE*/
		//Background method
		backgroundSettings(g, 0, 0, getWidth(), getHeight());
		
		// Upside-down Red triangle
        changeColor(255, 0, 0, g);
        drawTriangle(50, 50, 100, 150, 150, 50, g);

        // Green circle
        changeColor(0, 255, 0, g);
        drawCircle(250, 100, 40, g);

        // Blue triangle
        changeColor(0, 0, 255, g);
        drawTriangle(100, 350, 200, 100, 300, 350, g);

        // Yellow circle
        changeColor(255, 255, 0, g);
		drawCircle(400, 200, 80, g);
	}

	public static void main(String[] args) {
		var window = new JFrame("Method Lab 1");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600,600);
		window.setContentPane(new MethodsLab1());
		window.setVisible(true);
	}
}