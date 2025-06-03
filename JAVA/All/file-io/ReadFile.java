import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.File;

public class ReadFile extends JPanel {

	String fileName;
	File f;
	int num;
	int sum; // Will be printed to Window
	
	public ReadFile() {
		sum = 0; // sum counter
		fileName = "numbers.txt";
		f = new File(fileName);

		try {
			Scanner s = new Scanner(f);
			while (s.hasNext() == true) {
				num = s.nextInt();
				sum += num; // Add numbers to sum
				System.out.println("Found a number " + num);
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find " + fileName);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawString("The sum is " + sum, 10, 20);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,800);
		window.setContentPane(new ReadFile());
		window.setVisible(true);
	}
}
