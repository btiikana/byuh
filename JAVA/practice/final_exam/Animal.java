import java.awt.*;
import javax.swing.*;

public abstract class Animal {
    //fields
    protected ImageIcon animal;
    protected String name;
    protected int x, y;

    //canonical constructor
    public Animal(String name, ImageIcon animal) {
        //name is passed from sub-classes and stored here
        this.name = name;
        this.animal = animal;
    }

    //draw object
    public void paintObject(Graphics g) {
        animal.paintIcon(null, g, x, y);
    }

    //move object left
    public void moveLeft(int w) {
        if (x > 0) {
            x -= 10;
        } else {
            x = 0;
            System.out.println("You can't go left any further!");
        }
    }

    //move object right
    public void moveRight(int w) {
        if (x + animal.getIconWidth() < w) {
            x += 10;
        } else {
            x = w - animal.getIconWidth();
            System.out.println("You can't go right any further!");
        }
    }

    //move object up
    public void moveUp(int h) {
        if (y > 0) {
            y -= 10;
        } else {
            y = 0;
            System.out.println("You can't go any higher!");
        }
    }

    //move object down
    public void moveDown(int h) {
        if (y + animal.getIconWidth() < h) {
            y += 10;
        } else {
            y = h - animal.getIconWidth();
            System.out.println("You can't go any lower!");
        }
    }
}
