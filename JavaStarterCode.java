import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class JavaStarterCode extends JPanel {
	
	public JavaStarterCode() {
		//Your custom initialization code here
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new JavaStarterCode());
		window.setVisible(true);
	}
}