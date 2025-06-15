import java.awt.*;
import javax.swing.*;
import java.awt.Point;

public class Duck {

    int weight;
    Color featherColor;
    Position location;

    //default constructor
    public Duck() {
        weight = 70;
        featherColor = Color.BLACK;
    }

    public void makeNoise() {
        System.out.println("QUACK QUACK!!");
    }

    public void eat() {
        weight++;
    }

    public void move(int dx, int dy) {
        location.translate(dx, dy);
    }
}
