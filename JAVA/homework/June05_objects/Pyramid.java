import java.awt.*;

//Name: Betero Tiikana
//Course: CS202

public class Pyramid {

    //Fields
    private Point pos;
    private Color stairColor;
    private Color brickColor;
    private int spacing = 10;

    //Default Constructor for 
    public Pyramid() {
        this(new Point(100, 200));//copy x and y logic
        //inherits default colors too from x and y constructor
    }

    //x and y constructor for second pyramid position
    public Pyramid(int x, int y) {
        pos = new Point(x, y);// main focus for pyramid location
        stairColor = Color.BLACK;
        brickColor = Color.ORANGE;
    }

    // Point constructor
    public Pyramid(Point p) {
        pos = p;// Set position using Point object
        stairColor = Color.BLACK;
        brickColor = Color.ORANGE;
    }

    // setters
    public void setStairColor(Color c) {
        stairColor = c;
    }

    public void setBrickColor(Color c) {
        brickColor = c;
    }

    public void setStairSpacing(int space) {
        this.spacing = space;// Set custom spacing between stair lines
    }

    //Draw Method
    public void draw(Graphics g) {
        int x = pos.x;
        int y = pos.y;

        // Draw bricks
        g.setColor(brickColor);
        g.fillRect(x + 40, y, 90, 40);
        g.fillRect(x + 20, y + 30, 130, 60);
        g.fillRect(x, y + 50, 170, 80);
        g.fillRect(x - 20, y + 70, 210, 50);
        g.fillRect(x - 40, y + 90, 250, 40);

        // Draw front stairs(lines)
        g.setColor(stairColor);
        g.drawOval(x + 48, y + 5, 75, 30); // top oval/stair

        // Front stair lines spaced using the spacing value
        g.drawLine(x + 80, y + 70 + spacing * 0, x + 100, y + 70 + spacing * 0);
        g.drawLine(x + 60, y + 70 + spacing * 1, x + 120, y + 70 + spacing * 1);
        g.drawLine(x + 40, y + 70 + spacing * 2, x + 140, y + 70 + spacing * 2);
        g.drawLine(x + 20, y + 70 + spacing * 3, x + 160, y + 70 + spacing * 3);
        g.drawLine(x + 10, y + 70 + spacing * 4, x + 170, y + 70 + spacing * 4);
        g.drawLine(x, y + 70 + spacing * 5, x + 180, y + 70 + spacing * 5);
    }
}