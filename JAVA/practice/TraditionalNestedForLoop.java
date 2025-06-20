import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class TraditionalNestedForLoop extends JPanel {

    ImageIcon heart1;
	
	public TraditionalNestedForLoop() {
		//Your custom initialization code here
        heart1 = new ImageIcon("heart1.png");
        
	}

	@Override
	public void paintComponent(Graphics g) {
	//Your custom rendering code here
        //Traditional For Loop
        int x = 0;
        int y = 0;
        int w = getWidth();

        for (int i=0; i<w; i++) {
            for (int j=0; j<w; j++) {
                heart1.paintIcon(null, g, x, y);
                x += 100;
            }
            y += 90;
            x = 0;
        }
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new TraditionalNestedForLoop());
		window.setVisible(true);
        System.out.println("Hearts have been successfully drawn!");
	}
}