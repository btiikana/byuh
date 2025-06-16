import java.awt.*;

// Duck is a type of Bird, so it extends Bird
public class Duck extends Bird {
    public Duck(int x, int y, Color color) {
        super(x, y, color); // Call Bird's constructor
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        // Draw body
        g.fillOval(x, y, 60, 30);
        // Draw head
        g.fillOval(x + 40, y - 10, 20, 20);
        // Draw beak
        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[]{x + 60, x + 70, x + 60},new int[]{y, y + 5, y + 10}, 3);
    }
}