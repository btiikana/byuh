import javax.swing.*;
import java.awt.*;

public class Pokemon {
    private int hp;
    private String name;
    private ImageIcon picture;
    private Rectangle location;

    public Pokemon(String n, int h) {
        name = n;
        hp = h;
        location = new Rectangle();
    }

    public void setPicture(String filename) {
        picture = new ImageIcon(filename);
        int w = picture.getIconWidth();
        int h = picture.getIconHeight();
        location.setSize(w,h);
    }

    public void move(int dx, int dy) {
        location.translate(dx, dy);
    }

    //this method returns the object that won the battle
    public Pokemon battle(Pokemon other) {
        if (this.hp > other.hp) {
            return this;
        } else {
            return other;
        }

    }

    public String greet() {
        return "My name is " + name + ", and my HP is " + hp;
    }

    public void talk() {
        System.out.println("My name is " + name);
        System.out.println("And my HP is " + hp);
        System.out.println("And my special powers are: ");
        if (specialPowers.isEmpty() == 0) {
            System.out.println("none");
        } else {
            for (var sp:specialPowers) {
                System.out.println(sp);
            }
        }
    }

    public void draw(Graphics g) {
        if (picture != null) {
            picture.paintIcon(null, g, location.x, location.y);
        }
        g.drawString(greet(), location.x, location.y+20);
    }
}
