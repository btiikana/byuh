import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class InsertwithLoop extends JPanel {
	
    ImageIcon heart;
    ImageIcon[][] heartArray;

	public InsertwithLoop() {
		//Your custom initialization code here
        heart = new ImageIcon("heart1.png");
        heartArray = new ImageIcon[5][5]; //Initialize heart references
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                heartArray[i][j] = heart;
            }
        }
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        int x = 0;
        int y = 0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                heartArray[i][j].paintIcon(null, g, x, y); // Paint the hearts
                x += 90;
            }
            y += 90;
            x = 0;
        }
    }

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new InsertwithLoop());
		window.setVisible(true);
	}
}
