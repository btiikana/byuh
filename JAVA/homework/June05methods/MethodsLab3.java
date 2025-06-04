import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;

//Name: Betero Tiikana
//Course: CS 202

//PART 3
public class MethodsLab3 extends JPanel {

	ArrayList<String> instructions;

	public MethodsLab3() {
		instructions = new ArrayList<>();
		String userInput = JOptionPane.showInputDialog("Enter File Name: e.g david.txt");
		File fileName = new File(userInput);
		try {
			Scanner scanFile = new Scanner(fileName);
			while (scanFile.hasNext()) {
				String line = scanFile.nextLine(); //Read on line
				instructions.add(line); //add to instructions array
			}
			scanFile.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found!");
			System.exit(0);

		}
		
	}

	public void parseCommand(String command, Graphics g) {
        String[] splitLineItems = command.split(" "); //splitting line contents

		//Look for line that has "COLOR" at index 0
        if (splitLineItems[0].equalsIgnoreCase("COLOR")) {
            int red = Integer.parseInt(splitLineItems[1]); //Convert string to int
            int green = Integer.parseInt(splitLineItems[2]);//Convert string to int
            int blue = Integer.parseInt(splitLineItems[3]);//Convert string to int
            changeColor(red, green, blue, g);
		
		//Look for line that has "CIRCLE" at index 0
        } else if (splitLineItems[0].equalsIgnoreCase("CIRCLE")) {
            int xc = Integer.parseInt(splitLineItems[1]);//Convert string to int
            int yc = Integer.parseInt(splitLineItems[2]);//Convert string to int
            int r = Integer.parseInt(splitLineItems[3]);//Convert string to int
            drawCircle(xc, yc, r, g);

		//Look for line that has "TRIANGLE" at index 0
        } else if (splitLineItems[0].equalsIgnoreCase("TRIANGLE")) {
            int x1 = Integer.parseInt(splitLineItems[1]);//Convert string to int
            int y1 = Integer.parseInt(splitLineItems[2]);//Convert string to int
            int x2 = Integer.parseInt(splitLineItems[3]);//Convert string to int
            int y2 = Integer.parseInt(splitLineItems[4]);//Convert string to int
            int x3 = Integer.parseInt(splitLineItems[5]);//Convert string to int
            int y3 = Integer.parseInt(splitLineItems[6]);//Convert string to int
            drawTriangle(x1, y1, x2, y2, x3, y3, g); //call drawTriangle and pass coordinate values to it
        }
    }

	public void backgroundSettings(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.BLACK); // Color content for this method
	}

	//method to change color
    public void changeColor(int red, int green, int blue, Graphics g) {
		Color newColor = new Color(red, green, blue);
		g.setColor(newColor);
    }

    //method to draw triangle
    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g) {
		g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

    //method to draw circle
    public void drawCircle(int xc, int yc, int r, Graphics g) {
		int x = xc - r;
		int y = yc - r;
		int size = 2 * r;
		g.drawOval(x, y, size, size);

    }

	@Override
	public void paintComponent(Graphics g) {
		/*CALL METHODS HERE*/
		//Background method
		backgroundSettings(g, 0, 0, getWidth(), getHeight());

		for (String line : instructions) {
			parseCommand(line, g);
		}
    }

	public static void main(String[] args) {
		var window = new JFrame("Method Lab 2");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(340,400);
		window.setContentPane(new MethodsLab3());
		window.setVisible(true);
	}
}