import javax.swing.*;
import java.awt.*;

public class Pokemon {

    private int hp;
    private String name;
    private ImageIcon picture;
    private Rectangle location;

    public Pokemon() {
    }

    public Pokemon(String n, int h) {
        name = n;
        hp = h;
    }

    public void setPicture(String fileName) {
        picture = new ImageIcon(fileName);
        int w = picture.getIconWidth();
        int h = picture.getIconHeight();
        location.setSize(w, h);
    }

    public void move(int dx, int dy) {
        location.translate(dx, dy);
    }
    public void battle(Pokemon other) {
        //TO-DO implement a battle between
        //"this" object and the "other" object
    }

    public String greet() {
        return "My name is " + name + ", and my HP is " + hp;
    }

    public void talk() {
        System.out.println("My name is" + name);
        System.out.println("And my hp is" + hp);
    }

    public void draw(Graphics g) {
        if (picture != null) {
            picture.paintIcon(null, g, location.x, location.y);
        }
        g.drawString(greet(), location.x, location.y + 20);
    }
}
