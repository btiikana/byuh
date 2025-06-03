import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class FunDuck extends JPanel {
	
    ImageIcon duck;
    String userInput;

	public FunDuck() {
        duck = new ImageIcon("duck.png");
        userInput = JOptionPane.showInputDialog("Do you want a gift: Choose [Y]es or [N]o");
        if (userInput.startsWith("Y")) {
            continue;
        } else if (userInput.startsWith("N")&& userInput.equalsIgnoreCase("n")) {
            System.out.println("Sorry that we don't have what you like.");
            System.exit(0);
        } else {
            System.out.println("Check your answer and try again!");
            System.exit(0);
        }
	}

	@Override
	public void paintComponent(Graphics g) {
        //Background settings
        int w = getWidth();
        int h = getHeight();

        //Draw background gray
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, w, h);

        //create object
        xYPosition pos = new xYPosition(200, 220);

        //call method
        drawDuck(g, pos, duck);
	}

    public void drawDuck(Graphics g, xYPosition pos, ImageIcon duck) {
        g.drawString("Your duck is drawn!", 200, 200);
        duck.paintIcon(g, pos, duck);
        
    }

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new FunDuck());
		window.setVisible(true);
	}
}
