import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;


public class PythonForLoop extends JPanel{
    
    ImageIcon duck;
    String[] names;

    public PythonForLoop() {
        // Initializer

        // My gift
        duck = new ImageIcon("duck.png");

        // Beautifuls
        names = new String[] {
            " ",
            " ", " "
        };
        // or
        // names = new String[3];
        // names[0] = " ";
        // names[1] = " ";
        // names[2] = " ";

        //calling updateNames
        updateNames();
    }


    // Update names
    public void updateNames() {
        names = new String[] {
            "Ruby T",
            "Tio T",
            "Des T"
        };
        // or
        // names[0] = "Ruby T";
        // names[1] = "Tio T";
        // names[2] = "Des T";
    }

    @Override
    public void paintComponent(Graphics g) {
        // Background Settings
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.PINK);
        g.fillRect(0, 0, w, h);

        int x = 170;
        int y = 20;
        System.out.println("Names:");
        for (var name : names) {
            g.setColor(Color.BLUE);
            g.drawString(name, x, y);
            y += 40;
            System.out.println(name);
        }

        duck.paintIcon(null, g, 150, 120);
        System.out.println("Duck is Successfully Drawn!");
    }


public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new PythonForLoop());
		window.setVisible(true);
	}
}
