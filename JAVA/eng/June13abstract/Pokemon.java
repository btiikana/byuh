import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class Pokemon {
    private int hp;
    private String name;
    private ImageIcon picture;
    private Rectangle location;
    private ArrayList<String> specialPowers;

    public Pokemon(String n, int h) {
        name = n;
        hp = h;
        location = new Rectangle();
        specialPowers = new ArrayList<>();
    }

    public void setPicture(String filename) {
        picture = new ImageIcon(filename);
        int w = picture.getIconWidth();
        int h = picture.getIconHeight();
        location.setSize(w, h);
    }

    public void move(int dx, int dy) {
        location.translate(dx, dy);
    }

    // This method returns the object that won the battle
    public Pokemon battle(Pokemon other) {
        return (this.hp > other.hp) ? this : other;
    }

    public abstract String greet();

    public void talk() {
        System.out.println("My name is " + name);
        System.out.println("And my HP is " + hp);
        System.out.println("And my special powers are: ");
        if (specialPowers.isEmpty()) {
            System.out.println("none");
        } else {
            for (String sp : specialPowers) {
                System.out.println(sp);
            }
        }
    }

    public void draw(Graphics g) {
        if (picture != null) {
            picture.paintIcon(null, g, location.x, location.y);
        }
        g.drawString(greet(), location.x, location.y + 20);
    }

    // Optional: add method to add special powers
    public void addSpecialPower(String power) {
        specialPowers.add(power);
    }
}
