
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class AccessWithLoop extends JPanel {

    String[] myArray;
	
	public AccessWithLoop() {
		//Your custom initialization code here
        myArray = new String[]{
            "Aloha", "World"
        };

        //Call displayIndexes()
        displayIndexes();
    }

    public void displayIndexes() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Index " + i + " " + "stores " + myArray[i]);
        }
    }

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AccessWithLoop());
		window.setVisible(true);
	}
}
