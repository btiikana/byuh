import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;

// MODIFYING THE ASTEROID CODES TO SET JOPTIONPANE
public class Asteroid extends JPanel {

    int dy;
    int dx;
    ImageIcon lamb;
    String sheepPosition;

    public Asteroid() {
    //Your custom rendering code here
        String boydat = JOptionPane.showInputDialog("Give me a DIY for the little prince");
        dy = Integer.parseInt(boydat);
        String boydat1 = JOptionPane.showInputDialog("Give me a DIY for the little prince");
        dx = Integer.parseInt(boydat);
        // Sheep
        lamb = new ImageIcon("sheep.png");
        sheepPosition = JOptionPane.showInputDialog("Sheep on the [L]eft or [R]ight?");
    }

	@Override
	public void paintComponent(Graphics g) {
        /* Make variables to move the objects */
        var w = getWidth();
        var h = getWidth();
        // var dy = 0;
        // var dx = -50;
        /* First, draw the black sky of outer space*/
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);


        /* Second, draw Asteroid parts*/
        g.setColor(Color.GRAY);
        g.fillOval(-100, 250, w, h);

        /* Third, draw the prince's head */
        g.setColor(new Color(173, 132, 101));
        g.fillOval(dx + 175, dy + 83, 50, 60);

        /* Fourth, draw his shirt */
        g.setColor(Color.GREEN);
        g.fillRect(dx + 165, dy + 145, 70, 90);

        /* Fifth, draw his legs */
        g.fillRect(dx + 165, dy + 235, 25, 70); // Left leg
        g.fillRect(dx + 210, dy + 235, 25, 70); // Right leg

        /* Finally, draw his bow tie */
        g.setColor(Color.RED);
        g.fillOval(dx + 190, dy + 133, 12, 20);
        g.fillOval(dx + 200, dy + 133, 12, 20);

        // Draw the prince's pet sheep
        if (sheepPosition.equals("l")) {
            lamb.paintIcon(null, g, 0, 300);
        } else {
            lamb.paintIcon(null, g, 220, 250);
        }
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Asteroid());
		window.setVisible(true);
	}
}

