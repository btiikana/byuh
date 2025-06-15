import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

public class MainPyramidCopy extends JPanel {

    private PyramidCopy pyramid;
    private PyramidCopy secondPyramid;
    private PyramidCopy pyramidStairs;

    public MainPyramidCopy() {
        //call first pyramid
        pyramid = new PyramidCopy(100, 200);
        pyramid.setBrickColor(Color.ORANGE);
        pyramid.setStairColor(Color.BLACK);

        //call second pyramid
        secondPyramid = new PyramidCopy(new Point(250, 100));
        secondPyramid.setBrickColor(Color.BLACK);
        secondPyramid.setStairColor(Color.ORANGE);
        secondPyramid.setStairSpacing(12);
    }

    public void backgroundItems(Graphics g) {
    // Background
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
    // Sun
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 60, 60);
    // Cloud 1
        g.setColor(Color.WHITE);
        g.fillOval(100, 10, 50, 20);
        g.fillOval(120, 10, 50, 10);
    // Cloud 2
        g.fillOval(200, 10, 50, 20);
        g.fillOval(220, 10, 50, 10);
    // Cloud 3
        g.fillOval(300, 10, 50, 20);
        g.fillOval(320, 10, 50, 10);
    // Mountains
        g.setColor(Color.GREEN);
        g.fillRect(0, 170, getWidth(), getHeight());
        g.fillOval(-20, 120, 180, 100);

    // Vegetation
        g.fillRect(200, 150, 20, 70);
        g.fillRect(250, 150, 20, 70);
        g.fillRect(300, 150, 20, 70);
        g.fillRect(350, 150, 20, 70);
    //Airplane
        g.setColor(Color.WHITE);
        g.fillRect(250, 70, 100, 20);
        g.fillRect(240, 60, 10,20);
        g.fillRect(289, 60, 10,20);
        g.setColor(Color.ORANGE);
        g.fillRect(350, 70, 10,20);
    // Trail and Seasider
        g.setColor(Color.WHITE);
        g.fillRect(200, 70, 5,5);
        g.fillRect(210, 70, 5,5);
        g.fillRect(220, 70, 5,5);
        g.fillRect(230, 70, 5,5);
        g.fillRect(100, 70, 100,40);
        g.setColor(Color.RED);
        g.drawString("GO SEASIDER!!", 105, 90);
    // Ground
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 300, getWidth(), getWidth());

    // My name
        g.setColor(Color.WHITE);
        g.fillRect(150, 320, 80, 35);
        g.setColor(Color.BLACK);
        g.drawString("Betero Tiikana", 150, 340);
    }

    @Override
    public void paintComponent(Graphics g) {
        //call backgroundItems method
        backgroundItems(g);
        
        //call draw method
        pyramid.draw(g);
        secondPyramid.draw(g);
    }

    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setContentPane(new MainPyramidCopy());
        window.setVisible(true);
    }
}
