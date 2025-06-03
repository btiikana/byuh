import /* javax.swing is a package*/javax.swing.JPanel;
import /* javax.swing is a package*/javax.swing.JFrame;
import /* java.awt is graphics package*/java.awt.Graphics;

public class windowFun extends JPanel {

    @Override
    public void /*JFrame Calls this method*/paintComponent(Graphics g) {
        g.drawString("Hello World!", 20, 50);
        g.drawString("Learning JAVA is pretty cool!", 20, 70);
        g.drawString("Everyone should Try it!", 20, 90);
    }

    public static void main(String[] args) {

        // Create a window
        var window = new JFrame();

        // Set Window size
        window.setSize(400, 400);

        // Program closes when user exits window (not default)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make windowFun class responsible for the Contents inside Window
        window.setContentPane(new windowFun());

        // Turn the window on
        window.setVisible(true);

    }

}
