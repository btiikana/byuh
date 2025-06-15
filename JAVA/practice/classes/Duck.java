import java.awt.*;

public class Duck {

    private Color duckColor;
    
    //default constructor
    public Duck() {
        duckColor = Color.WHITE;

    }

    //x and y constructor
    public Duck(int x, int y) {

    }

    //point constructor
    public Duck(Point p) {

    }

    public void draw(Graphics g) {
        //draw duck
        //head
        g.setColor(Color.YELLOW);
        g.fillOval(38, 20, 60, 40);
        // nose
        g.setColor(Color.RED);
        g.fillRect(30, 38, 10, 10);
        //eyes
        g.setColor(Color.BLACK);
        g.fillOval(45, 25, 10, 10);
        //body
        g.setColor(Color.YELLOW);
        g.fillOval(40, 50, 120, 50);
        //legs
        g.setColor(Color.RED);
        g.fillRect(80, 99, 5, 30); //left leg
        g.fillRect(105, 99, 5, 30); //right leg
    }
}
