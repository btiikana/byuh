import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main extends JPanel{

    public Main() {
	}

	@Override
	public void paintComponent(Graphics g) {
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Main());
		window.setVisible(true);
	}
}
