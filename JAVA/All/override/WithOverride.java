import javax.swing.*;
import java.awt.*;

public class WithOverride extends JPanel {
    
    ImageIcon duck;

    public WithOverride() {
        duck = new ImageIcon("duck.png");
    }

    @Override
	public void paintComponent(Graphics g) {
        duck.paintIcon(null, g, 20, 50);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new WithOverride());
		window.setVisible(true);
	}
}


