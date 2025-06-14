import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

public class Room extends JPanel {
	
    //Fields
    private Point pos;
    private Room exitEast;
    private Room exitWest;
    private Room exitNorth;
    private Room exitSouth;

    //default constructor
    public Room() {
        exitEast = null;
        exitWest = null;
        exitNorth = null;
        exitSouth = null;
    }

	public Room(int x, int y) {
        pos = new Point(x, y);
	}

    //method to draw 50x50 box
    public void draw(Graphics g) {
        int[] x = ;
        int[] y = ;
        int z = ;
        
        //triangle room drawing
        g.drawPolyline(int[] x, int[] y, int);
    }
}
