import javax.swing.*;
import java.awt.*;

public class DrawFigure extends JPanel {

	public DrawFigure() {
	}

    public void background(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);
    }

	@Override
	public void paintComponent(Graphics g) {
    //call background to draw
        background(g);

    //draw duck
        //head
        g.setColor(Color.YELLOW);
        g.fillOval(38, 20, 60, 40);
        // nose
        g.setColor(Color.RED);
        g.fillRect(30, 38, 10, 10);
        //eyes
        g.setColor(Color.BLACK);
        g.fillOval(45, 25, 10, 10);
        //body
        g.setColor(Color.YELLOW);
        g.fillOval(40, 50, 120, 50);
        //legs
        g.setColor(Color.RED);
        g.fillRect(80, 99, 5, 30); //left leg
        g.fillRect(105, 99, 5, 30); //right leg

	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500,500);
		window.setContentPane(new DrawFigure());
		window.setVisible(true);
	}
}