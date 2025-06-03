import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class EnhancedForLoop extends JPanel {
	
    String[] songs;

	public EnhancedForLoop() {
		//Your custom initialization code here
		songs = new String[3];
		songs[0] = "Trees of the valley - Night Lovell";
		songs[1] = "Queen of my heart - WestLife";
		songs[2] = "Dark King = Boogie with Da Hoodie";

	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
		

		//Background Settings
		var w = getWidth();
		var h = getHeight();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, w, h);

		int x = 100;
		int y = 20;
		for (var song:songs) {
			g.setColor(Color.YELLOW);
			g.drawString(song, x, y);
			y += 20;

		}
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new EnhancedForLoop());
		window.setVisible(true);
	}
}
