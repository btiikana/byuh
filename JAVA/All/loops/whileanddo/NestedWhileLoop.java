package whileanddo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class NestedWhileLoop extends JPanel {

    ImageIcon duck;

	
	public NestedWhileLoop() {
		//Your custom initialization code here
        duck = new ImageIcon("duck.png");

	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        int iconWidth = duck.getIconWidth();
        int iconHeight = duck.getIconHeight();
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int y = 0;
        while (y < panelHeight) {
            int x = 0;
            while (x < panelWidth) {
                duck.paintIcon(null, g, x, y);
                x += iconWidth;
            }
            y += iconHeight;
        }
    }

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new NestedWhileLoop());
		window.setVisible(true);
	}
}
