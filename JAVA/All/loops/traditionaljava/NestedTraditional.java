import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;

public class NestedTraditional extends JPanel {
	
	ImageIcon duck;

	public NestedTraditional() {
		//Your custom initialization code here
		duck = new ImageIcon("duck.png");
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
		int x = 0;
		int y = 0;

		/*for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				duck.paintIcon(null, g, x, y);
				x+=50;
			}
			y+=50;
			x = 0;
		}*/

		int w = getWidth();
		int h = getHeight();
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				g.setColor(Color.BLACK);
				g.drawString("hello", x, y);
				g.drawRect(x, y, w/10, h/10);
			}
			y += h/10;
			x = 0;
		}
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new NestedTraditional());
		window.setVisible(true);
	}
}
