import java.awt.*;

public abstract class Bird {
    protected int x, y;
    protected Color color;

    public Bird(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Abstract method — must be implemented in subclasses
    public abstract void draw(Graphics g);

    // NEW abstract method
    public abstract void makeSound();
}

