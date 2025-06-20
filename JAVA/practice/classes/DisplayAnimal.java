import javax.swing.*;
import java.awt.*;

public class DisplayAnimal extends JPanel {

    private Duck brownDuck;
    private Duck blackDuck;
    private Duck yellowDuck;


    public DisplayAnimal() {
        brownDuck = new Duck(); //calls default constructor
        blackDuck  = new Duck(); // calls x and y constructor
        yellowDuck = new Duck(); // calls point constructor
    }

    public void background(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);
    }
    
    @Override
	public void paintComponent(Graphics g) {
        //call background method
        background(g);
        brownDuck.draw(g);
        blackDuck.draw(g)

        //draw using objects
        
	}

	public static void main(String[] args) {
		var window = new JFrame("Display Animal Window");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new DisplayAnimal());
		window.setVisible(true);
	}
}
