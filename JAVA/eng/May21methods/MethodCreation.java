// Name: Betero Tiikana
// Course: CS202

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MethodCreation extends JPanel {
	
    String[] firstName;

	public MethodCreation() {
        firstName = new String[2];
        firstName[0] = "Betero";
        firstName[1] = "Destiny";
	}

	@Override
	public void paintComponent(Graphics g) {
        // Background Settings
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.GRAY);
        g.fillRect(0,0,w,h);

        //Call displayNames method and pass values to it from paintComponent class
        displayNames(g, 10, 10);
	}

    // Make own method -- displayNames()
    // Initiate Graphics g so java recognizes what's being passed from a caller
    public void displayNames(Graphics g, int x, int y)/* parameter list */ {
        g.setColor(Color.RED);
        for (int i=0; i<firstName.length; i++) {
            g.drawString("Names: " + firstName[i], x, y);
            y += 20;
        }
        
    }

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new MethodCreation());
		window.setVisible(true);
	}
}