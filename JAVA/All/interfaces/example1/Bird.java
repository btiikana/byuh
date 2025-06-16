import java.awt.*;

public abstract class Bird {
    protected int x, y;
    protected Color color;

    public Bird(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void sayHello() {
        System.out.println("I am a bird!");
    }

    public abstract void draw(Graphics g);     // abstract
    public abstract void makeSound();          // abstract
}
