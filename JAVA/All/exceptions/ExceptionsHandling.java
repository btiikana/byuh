import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class ExceptionsHandling extends JPanel {
	
    int age; //Fields
    ImageIcon img;

	public ExceptionsHandling() {
        img = new ImageIcon("duck.png");
        String input = JOptionPane.showInputDialog("Please enter your age. ");
        try {
            age = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Did you mean to write that or your age: 16");
            age = 16;
        }
	}

	@Override
	public void paintComponent(Graphics g) {
        if (age >= 13 && age <= 19) {
            //g.drawString("duck quacks" 10, 10);
            img.paintIcon(null, g, 60, 200);
        } else {
            g.drawString("No ducks for you, don't cry now!", 10, 10);
        }
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new ExceptionsHandling());
		window.setVisible(true);
	}
}
