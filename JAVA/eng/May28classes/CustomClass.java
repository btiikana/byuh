import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import java.awt.Color;

public class CustomClass extends JPanel {

    String userInput;

	public CustomClass() {
        userInput = JOptionPane.showInputDialog("Enter name:");
	}

	@Override
	public void paintComponent(Graphics g) {
        //Background settings
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

        //call method
        printName(g, 10, 10);
	}

    public void printName(Graphics g, int x, int y) {
        //Draw name
        g.setColor(Color.YELLOW);
        g.drawString("" + userInput, x, y);
    }

	public static void main(String[] args) {
		var window = new JFrame("What is your name:");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new CustomClass());
		window.setVisible(true);
	}
}
