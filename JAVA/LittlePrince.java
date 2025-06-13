import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

public class LittlePrince {
	Point location;
	Color outfitColor;
	boolean hasSheep;
	
	//I call a constructor with no parameters a "default constructor"
	public LittlePrince() {
		location = new Point();
		outfitColor = Color.GREEN;
		hasSheep = false;
	}
	
	public LittlePrince(int x, int y) {
		location = new Point(x,y);
		outfitColor = Color.GREEN;
		hasSheep = false;
	}
	
	public LittlePrince(int x, int y, Color c) {
		location = new Point(x,y);
		outfitColor = c;
		hasSheep = false;
	}
	
	
	public void talk() {
		System.out.println("Bonjour! I am the little prince!");
	}
	
	public void move(int dx, int dy) {
		location.x += dx;
		location.y += dy;
	}
	
	public void setOutfitColor(Color c) {
		outfitColor = c;
	}
	
	public void draw(Graphics g) {
		int dx = location.x;
		int dy = location.y;
		
		//next, draw the prince's head
		g.setColor(new Color(173,132,101));
		g.fillOval(175+dx, 83+dy, 50, 60);
		
		//next, draw his shirt
		g.setColor(outfitColor);
		g.fillRect(165+dx,145+dy, 70, 90);
		
		//next draw his pants
		g.fillRect(165+dx, 235+dy, 25, 70); //left leg
		g.fillRect(210+dx, 235+dy, 25, 70); //right leg
		
		//finally, draw his bow tie
		g.setColor(Color.RED);
		g.fillOval(190+dx,133+dy,12,20);
		g.fillOval(200+dx,133+dy,12,20);
	}

}