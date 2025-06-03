import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class AskGender extends JPanel {
	
    ImageIcon duck;

	public AskGender() {
		//Your custom initialization code here
        duck = new ImageIcon("duck.png");

        //Call AskGender()
        genderLogic();
	}

    public void genderLogic() {
    // Gender Restriction Logic
        String userInput = JOptionPane.showInputDialog("Choose your Gender: [M]ale or [F]emale");
        if (userInput.equalsIgnoreCase("m")) {
            JOptionPane.showMessageDialog(null, "Females Only Sorry");
            System.exit(0);
        }
    }

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        int x = 150;
        int y = 120;
        duck.paintIcon(null, g, x,y);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AskGender());
		window.setVisible(true);
	}
}