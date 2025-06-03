import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

// Tradition For Loop for JAVA
public class TraditionalForLoop extends JPanel {

    ImageIcon duck;

	
	public TraditionalForLoop() {
		//Your custom initialization code here
        duck = new ImageIcon("duck.png");

	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        int x = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            duck.paintIcon(null, g, x, y);
            x += 60;
    }
}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new TraditionalForLoop());
		window.setVisible(true);
	}
}