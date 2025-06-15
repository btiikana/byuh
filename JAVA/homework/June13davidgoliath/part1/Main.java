import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//Name: Betero Tiikana
//Course: CS202

//----------------------PART 1----------------
//Main class
public class Main extends JPanel {
    //fields
    private ArrayList<Room> rooms;
	private Color bgroundColor;

    //constructor
    public Main() {
        rooms = new ArrayList<>();

        // First row (row 0)
        rooms.add(new Room(20, 20));    // First room in first row
        rooms.add(new Room(110, 20));   // Second room in first row
        rooms.add(new Room(200, 20));   // Third room in first row
        rooms.add(new Room(290, 20));   // Fourth room in first row

        // Second row (row 1)
        rooms.add(new Room(20, 110));   // First room in second row
        rooms.add(new Room(110, 110));  // Second room in second row
        rooms.add(new Room(200, 110));  // Third room in second row
        rooms.add(new Room(290, 110));  // Fourth room in second row

        // Third row (row 2)
        rooms.add(new Room(20, 200));   // First room in third row
        rooms.add(new Room(110, 200));  // Second room in third row
        rooms.add(new Room(200, 200));  // Third room in third row
        rooms.add(new Room(290, 200));  // Fourth room in third row

        // Fourth row (row 3)
        rooms.add(new Room(20, 290));   // First room in fourth row
        rooms.add(new Room(110, 290));  // Second room in fourth row
        rooms.add(new Room(200, 290));  // Third room in fourth row
        rooms.add(new Room(290, 290));  // Fourth room in fourth row
    }

    //Main class inherits paintComponent method
    @Override
    protected void paintComponent(Graphics g) {
        bgroundColor = new Color(210, 240, 210); //instantiate color for bacgkround
        //background size
		int w = getWidth();
		int h = getHeight();

        //draw background
        g.setColor(bgroundColor); // Background color
		g.fillRect(0, 0, w, h); //background

        // Call draw methods for each room using enhanced loop
        for (Room room : rooms) {
            room.draw(g);
        }
    }

    //main method
    public static void main(String[] args) {
        JFrame window = new JFrame("David and Goliath Rooms");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(420, 440);
        window.setContentPane(new Main());
        window.setVisible(true);
    }
}

