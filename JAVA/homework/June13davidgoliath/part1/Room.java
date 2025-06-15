import java.awt.*;

//Name: Betero Tiikana
//Course: CS202

//----------------------PART 1----------------
//Room class
public class Room {
    private Point pos;
    private Color shapeColor;

    //x and y constructor
    public Room(int x, int y) {
        pos = new Point(x, y);
    }

    public void draw(Graphics g) {
        int x = pos.x;
        int y = pos.y;

        // Define 3 points for the triangle
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];

        xPoints[0] = x + 40;  // top
        yPoints[0] = y;

        xPoints[1] = x;       // bottom-left
        yPoints[1] = y + 80;

        xPoints[2] = x + 80;  // bottom-right
        yPoints[2] = y + 80;

        shapeColor = new Color(120, 180, 120);
        g.setColor(shapeColor);
        g.drawPolygon(xPoints, yPoints, 3); // Draw full triangle outline
    }
}
