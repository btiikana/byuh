import java.awt.*;

public class Duck extends Bird implements Flyable {
    public Duck(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        // Body
        g.fillOval(x, y, 60, 30);
        // Head
        g.fillOval(x + 40, y - 10, 20, 20);
        // Beak
        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[]{x + 60, x + 70, x + 60},
                      new int[]{y, y + 5, y + 10}, 3);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("The duck flaps its wings and flies away.");
    }
}
