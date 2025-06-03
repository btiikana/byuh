import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Loops extends JPanel {
	
    String[] songs;

	public Loops() {
		//Your custom initialization code here
        songs = new String[] {
            "Dark King", "Whiskey Lullaby", "Queen of My Heart"
        };

        // While loop starting point
        int spencer = 100;
        do {
            System.out.println(spencer + "Spencer's favorite class is CS202");
            spencer++;
        } while (spencer < 10 );
         /*for (int spencer = 0; spencer < 10; spencer ++) {
            System.out.println(spencer + " Spencer's favorite class is CS202");
         }*/
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        int x = 0;
        int y = 0;
        int w = getWidth();
        int h = getWidth();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);
        
        // do and while loop

	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Loops());
		window.setVisible(true);
        
	}
}