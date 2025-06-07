import java.awt.*;

public class Pyramid {

    private Point pos;
    private Color stairColor;
    private Color brickColor;
    private int spacing = 10; // default spacing

    // default constructor
    public Pyramid() {
        pos = new Point();
        this.pos.x = 100;
        this.pos.y = 200;
        stairColor = Color.BLACK;
        brickColor = Color.ORANGE;
    }

    // x and y constructor
    public Pyramid(int x, int y) {
        pos = new Point(x, y);
        stairColor = Color.BLACK;
        brickColor = Color.ORANGE;
    }

    // Point constructor
    public Pyramid(Point p) {
        pos = p;
        stairColor = Color.BLACK;
        brickColor = Color.ORANGE;
    }

    public void setStairColor(Color c) {
        stairColor = c;
    }

    public void setBrickColor(Color c) {
        brickColor = c;
    }

    public void setStairSpacing(int space) {
        this.spacing = space;
    }

    public void draw(Graphics g) {
        int x = pos.x;
        int y = pos.y;

        g.setColor(brickColor);
        g.fillRect(x + 40, y, 90, 40);
        g.fillRect(x + 20, y + 30, 130, 60);
        g.fillRect(x, y + 50, 170, 80);
        g.fillRect(x - 20, y + 70, 210, 50);
        g.fillRect(x - 40, y + 90, 250, 40);

        g.setColor(stairColor);
        g.drawOval(x + 48, y + 5, 75, 30);

        g.drawLine(x + 80, y + 70 + spacing, x + 100, y + 70 + spacing);
        g.drawLine(x + 60, y + 70 + spacing * 1, x + 120, y + 70 + spacing * 1);
        g.drawLine(x + 40, y + 70 + spacing * 2, x + 140, y + 70 + spacing * 2);
        g.drawLine(x + 20, y + 70 + spacing * 3, x + 160, y + 70 + spacing * 3);
        g.drawLine(x + 10, y + 70 + spacing * 4, x + 170, y + 70 + spacing * 4);
        g.drawLine(x, y + 70 + spacing * 5, x + 180, y + 70 + spacing * 5);
    }
}
