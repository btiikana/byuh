import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class sheepFun extends JPanel {
	
	public sheepFun() {
		//Your custom initialization code here
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here

		/* --------------- WINDOW JFRAME SETTINGS -------------- */
		/* Set background color */
		g.setColor(Color.BLACK);
		/* Variables to get the size of the window everytime it moves */
		var w = getWidth();
		var h = getHeight();
		var dx = 45; /* Change x, y positions quickly */
		/* Fill All Window Contents */
		g.fillRect(0, 0, w, h);



		/* --------------- SHEEP'S BODY -------------- */
		/* Set Sheep's color */
		g.setColor(Color.RED);

		/*Draw Sheep's Head */
		g.fillOval(dx + 75, 200, 225, 100);
		g.fillOval(dx + 50, 150, 75, 75);

		/* Draw Sheep's Legs */
		g.fillRect(dx + 100, 250, 25, 100);
		g.fillRect(dx + 150, 250, 25, 100);
		g.fillRect(dx + 200, 250, 25, 100);
		g.fillRect(dx + 250, 250, 25, 100);



		/* --------------- TEXTS -------------- */
		/* Set Text Color */
		g.setColor(Color.YELLOW);
		/* Write Texts */
		g.drawString("This is a sheep that a little Prince requested!", 90, 80);
		g.drawString("How does it look??", 90, 100);


	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new sheepFun());
		window.setVisible(true);
	}
}
