import java.awt.Color;
import java.awt.Point;

public class LittlePrince {

    Point location;
    Color outfitColor;
    Boolean hasSheep;


    //default constructor
    public LittlePrince() {
        location = new Point();
        outfitColor = Color.GREEN;
        hasSheep = false;
        
    }

    public LittlePrince(int x, int y) {
        this();
        location.setLocation(x, y);

        
    }

    public LittlePrince(int x, int y, Color c) {
        location = new Point(x, y);
        outfitColor = c;
        hasSheep = false;
        
    }
}
