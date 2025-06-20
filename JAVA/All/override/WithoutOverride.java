import javax.swing.*;
import java.awt.*;

public class WithoutOverride extends JPanel {
    
    ImageIcon duck;

    public WithoutOverride() {
        duck = new ImageIcon("duck.png");
    }

    //I intentionally mispelled paintComponent to see what happens
	public void paintComponant(Graphics g) {
        duck.paintIcon(null, g, 20, 50);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new WithoutOverride());
		window.setVisible(true);
	}
}

/*Without using override you will not still inherit elements from paintComponent
 but if you mispelled the paintComponent() then you will not get anything in the
 Panel. Override is useful to still inherit JPanel: paintComponent() even if it's
 mispelled.
 */

