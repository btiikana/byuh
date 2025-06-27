import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

//Name: Betero Tiikana
//Course: CS202

//Main class
public class Main extends JPanel implements KeyListener {
    //fields
    private ArrayList<Stone> stones;
    private ArrayList<Room> rooms;
    private String message;
    private Color bgroundColor;
    private Goliath goliath;
    private David david;
    

    //default contructor
    public Main() {
        //Greet player
        message = ("Welcome Player" + "\n" + "You must collect all the sprites" + "\n" + "in order to beat Goliath");
        JOptionPane.showMessageDialog(null, message);

        rooms = new ArrayList<>();
        //instantiate color for background
        bgroundColor = new Color(210, 240, 210);

        david = new David(); //instantiate David
        goliath = new Goliath(); //instantiate Goliath
        stones = new ArrayList<>(); //instantiate stone ArrayList

        // First row and rooms in it
        Room room1Row1 = new Room(20, 20);
        Room room2Row1 = new Room(110, 20);
        Room room3Row1 = new Room(200, 20);
        Room room4Row1 = new Room(290, 20);

        // Second row and rooms in it
        Room room1Row2 = new Room(20, 110);
        Room room2Row2 = new Room(110, 110);
        Room room3Row2 = new Room(200, 110);
        Room room4Row2 = new Room(290, 110);

        // Third row and rooms in it
        Room room1Row3 = new Room(20, 200);
        Room room2Row3 = new Room(110, 200);
        Room room3Row3 = new Room(200, 200);
        Room room4Row3 = new Room(290, 200);

        // Fourth row and rooms in it
        Room room1Row4 = new Room(20, 290);
        Room room2Row4 = new Room(110, 290);
        Room room3Row4 = new Room(200, 290);
        Room room4Row4 = new Room(290, 290);

        // Add rooms to rooms array list
        rooms.add(room1Row1);
        rooms.add(room2Row1);
        rooms.add(room3Row1);
        rooms.add(room4Row1);
        rooms.add(room1Row2);
        rooms.add(room2Row2);
        rooms.add(room3Row2);
        rooms.add(room4Row2);
        rooms.add(room1Row3);
        rooms.add(room2Row3);
        rooms.add(room3Row3);
        rooms.add(room4Row3);
        rooms.add(room1Row4);
        rooms.add(room2Row4);
        rooms.add(room3Row4); 
        rooms.add(room4Row4);

        // ROOM EXIT SETUP
        //----------First row-----------
        //room 1
        room1Row1.setEastExit(room2Row1);
        room1Row1.setSouthExit(room1Row2);
        //room 2
        room2Row1.setWestExit(room1Row1);
        room2Row1.setEastExit(room3Row1);
        room2Row1.setSouthExit(room2Row2);
        //room 3
        room3Row1.setWestExit(room2Row1);
        room3Row1.setEastExit(room4Row1);
        room3Row1.setSouthExit(room3Row2);
        //room 4
        room4Row1.setWestExit(room3Row1);
        room4Row1.setSouthExit(room4Row2);

        //----------Second row----------
        //room 1
        room1Row2.setEastExit(room2Row2);
        room1Row2.setSouthExit(room1Row3);
        //room 2
        room2Row2.setWestExit(room1Row2);
        room2Row2.setEastExit(room3Row2);
        room2Row2.setNorthExit(room2Row1);
        room2Row2.setSouthExit(room2Row3);
        //room 3
        room3Row2.setWestExit(room2Row2);
        room3Row2.setNorthExit(room3Row1);
        //room 4
        room4Row2.setNorthExit(room4Row1);
        room4Row2.setSouthExit(room4Row3);

        //----------Third row-----------
        //room 1
        room1Row3.setNorthExit(room1Row2);
        //room 2
        room2Row3.setNorthExit(room2Row2);
        room2Row3.setEastExit(room3Row3);
        //room 3
        room3Row3.setWestExit(room2Row3);
        room3Row3.setSouthExit(room3Row4);
        //room 4
        room4Row3.setNorthExit(room4Row2);
        room4Row3.setSouthExit(room4Row4);

        //----------Fourth row----------
        //room 1
        room1Row4.setEastExit(room2Row4);
        //room 2
        room2Row4.setWestExit(room1Row4);
        room2Row4.setEastExit(room3Row4);
        //room 3
        room3Row4.setWestExit(room2Row4);
        room3Row4.setNorthExit(room3Row3);
        //room 4
        room4Row4.setNorthExit(room4Row3);

        //-----David, Goliath & Stone-----
        david.setCurrentRoom(room1Row4); //set-up room where david will start at.
        goliath.setCurrentRoom(room4Row4); //set-up room where Goliath will be.

        //Instantiate & assign 5 stones
        Stone stone1 = new Stone(); //1 stone
        Stone stone2 = new Stone(); //2 stone
        Stone stone3 = new Stone(); //3 stone
        Stone stone4 = new Stone(); //4 stone
        Stone stone5 = new Stone(); //5 stone
        //add to stones array list
        stones.add(stone1);
        stones.add(stone2);
        stones.add(stone3);
        stones.add(stone4);
        stones.add(stone5);

        //set-up rooms where the stones will be.
        stone1.setCurrentRoom(room1Row1);
        stone2.setCurrentRoom(room4Row2);
        stone3.setCurrentRoom(room1Row3);
        stone4.setCurrentRoom(room3Row3);
        stone5.setCurrentRoom(room2Row4);

        //KeyListener built-in methods
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    //Method from KeyListener interface.
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //method from KeyListener
    @Override
    public void keyReleased(KeyEvent e) {

    }
    //override method from KeyListener interface
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        //key control buttons for Mr. David
        if (key == KeyEvent.VK_UP) {
            david.moveNorth();
            System.out.println("David moves UP");
        } else if (key == KeyEvent.VK_DOWN) {
            david.moveSouth();
            System.out.println("David moves DOWN");
        } else if (key == KeyEvent.VK_LEFT) {
            david.moveWest();
            System.out.println("David moves LEFT");
        } else if (key == KeyEvent.VK_RIGHT) {
            david.moveEast();
            System.out.println("David moves RIGHT");
        }

        //Key Controls for Goliath
        else if (key == KeyEvent.VK_W) {
            goliath.moveNorth();
            System.out.println("Goliath moves UP");
        } else if (key == KeyEvent.VK_S) {
            goliath.moveSouth();
            System.out.println("Goliath moves DOWN");
        } else if (key == KeyEvent.VK_A) {
            goliath.moveWest();
            System.out.println("Goliath moves LEFT");
        } else if (key == KeyEvent.VK_D) {
            goliath.moveEast();
            System.out.println("Goliath moves RIGHT");
        }
        // Re-draw David after movement
        repaint(); 
    }


    //main class inheriting paintComponent
    @Override
    protected void paintComponent(Graphics g) {
        //background size
		int w = getWidth();
		int h = getHeight();

        //draw background
        g.setColor(bgroundColor); // Background color
		g.fillRect(0, 0, w, h); //background

        for (Room room : rooms) {
            room.draw(g);
        }
        for (Stone stone : stones) {
            stone.draw(g);
        }
        david.draw(g);
        goliath.draw(g);

        //safety
        requestFocusInWindow();
    }

    //main method
    public static void main(String[] args) {
        JFrame window = new JFrame("David and Goliath Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(420, 440);
        window.setContentPane(new Main());
        window.setVisible(true);
    }
}

