import java.awt.Color;
import java.awt.Point;

public class LittlePrince {
    Point location;
    Color outfitColor;
    boolean hasSheep;
    
    // Default Constructor
    public LittlePrince() {
        location = new Point();
        outfitColor = Color.GREEN;
        hasSheep = false;
    }

    public LittlePrince(int x, int y) {
        location = new Point(x, y);
        outfitColor = Color.GREEN;
        hasSheep = false;
    }

    public LittlePrince(int x, int y, Color c) {
        location = new Point(x, y);
        outfitColor = c;
        hasSheep = false;
    }

    public void talk () {
        System.out.println("Bonjour! I am the little prince");
    }

    public void move(int dx, int dy) {
        location.x += dx;
        location.y += dy;
    }

    public void setOutfitColor() {

    }
}
