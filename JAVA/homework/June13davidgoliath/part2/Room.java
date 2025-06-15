import java.awt.*;

//Name: Betero Tiikana
//Course: CS202

//----------------------PART 2----------------
//Room class
public class Room {
    private Point pos;
    private Room exitEast;
    private Room exitWest;
    private Room exitNorth;
    private Room exitSouth;
    private Color eraser;
    private Color shapeColor;

    //x and y constructor
    public Room(int x, int y) {
        pos = new Point(x, y);
        exitEast = null;
        exitWest = null;
        exitNorth = null;
        exitSouth = null;
        shapeColor = new Color(120, 180, 120); //instantiate shapeColor
        eraser = new Color(210, 240, 210); //erase walls for corridors
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

        // North wall
        if (exitNorth != null) {
            g.setColor(shapeColor);
            g.drawLine(x + 30, y + 18, x + 30, y - 10);
            g.drawLine(x + 50, y + 18, x + 50, y - 10);
            g.setColor(eraser);
            g.fillRect(x + 31, y - 10, 19, 30);
        }

        // East wall
        if (exitEast != null) {
            //East Corridors
            g.setColor(shapeColor);
            g.drawLine(x + 70, y + 50, x + 105, y + 50);
            g.drawLine(x + 70, y + 60, x + 100, y + 60);
            //rectFill to clear path
            g.setColor(eraser);
            g.fillRect(x + 60, y + 50, 12, 11);
        }

        // South wall
        if (exitSouth != null) {
            //South Corridors
            g.setColor(shapeColor);
            g.drawLine(x + 30, y + 80, x + 30, y + 110);
            g.drawLine(x + 50, y + 80, x + 50, y + 110);
            //rectFill to clear path
            g.setColor(eraser);
            g.fillRect(x + 31, y + 79, 19, 30);
        }

        // West wall
        if (exitWest != null) {
            //West Corridors
            g.setColor(shapeColor);
            g.drawLine(x - 25, y + 50, x, y + 50);
            g.drawLine(x - 20, y + 60, x, y + 60);
            //rectFill to clear path
            g.setColor(eraser);
            g.fillRect(x + 5, y + 52, 12, 8);
        }
    }

    //methods to accept neighboring rooms
    public void setEastExit(Room r) {
        exitEast = r;
        r.exitWest = this;
    }

    public void setWestExit(Room r) {
        exitWest = r;
        r.exitEast = this;
    }

    public void setNorthExit(Room r) {
        exitNorth = r;
        r.exitSouth = this;
    }

    public void setSouthExit(Room r) {
        exitSouth = r;
        r.exitNorth = this;
    }
}