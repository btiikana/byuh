import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

//We are drawing a sheep in this custom class creation example.
public class CustomClass extends JPanel {

	public CustomClass() {

	}

	@Override
	public void paintComponent(Graphics graph) {
        int w = getWidth();
        int h = getHeight();

        //draw a black background
        graph.setColor(Color.BLACK);
        graph.fillRect(0, 0, w, h);

        methodCaller(graph);
	}

    //method caller
    public void methodCaller(Graphics graph) {
        //Create objects before calling methods
        Pyramid pos1 = new Pyramid(0, -50);
        Pyramid pos2 = new Pyramid(100, -80);

        //call methods here
        drawSheep(graph, pos1, Color.RED);
        drawSheep(graph, pos2, Color.BLUE);
        // drawSheep(graph, -50, -100, Color.YELLOW);
        // drawSheep(graph, 100, -10, Color.GREEN);
    }

    public void drawSheep(Graphics graph, Pyramid pos, Color C) {
        graph.setColor(C);
        graph.fillOval(pos.x+75, pos.y+200, 225, 100);
        graph.fillOval(pos.x+50, pos.y+150, 75, 75);
        graph.fillOval(pos.x+100, pos.y+250, 25, 100);
        graph.fillOval(pos.x+150, pos.y+250, 25, 100);
        graph.fillOval(pos.x+200, pos.y+250, 25, 100);
        graph.fillOval(pos.x+250, pos.y+250, 25, 100);
    }

    public void drawSheep(Graphics graph, Pyramid pos) {
        drawSheep(graph, pos, Color.WHITE);
    }

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500,500);
		window.setContentPane(new CustomClass());
		window.setVisible(true);
	}
}
