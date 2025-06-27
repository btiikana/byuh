import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JPanel implements KeyListener{
    
    //fields
    static private Animal a1 = null;
    static private Animal a2 = null;
    private String messagePane;
    private String userChoice;
    private String askName;
    private String animalName;

    //contructor
    public Main() {
        messagePane = JOptionPane.showInputDialog("What do you want to see?" + "\n"
        + "Choose:" + " [C]Cat or [D]Dog");
        userChoice = messagePane.toLowerCase();

        //if-else logic to filter userChoice
        if (userChoice.equalsIgnoreCase("d")) {
            a1 = new Dog("Tintin", new ImageIcon("dog.png"));
            
        } else if (userChoice.equalsIgnoreCase("c")) {
            a2 = new Cat("Garfield", new ImageIcon("cat.png"));
        }

        askName = JOptionPane.showInputDialog("Try asking its name: ");
        animalName = askName.toLowerCase();
        if (a1 != null && animalName.equalsIgnoreCase("what is your name?")) {
            JOptionPane.showMessageDialog(null, "Hello there! " + "\n"
             + "My name is: " + a1.name + "\n" + "Click [Okay] below to see my picture!");
        } else if (a2 != null && animalName.equalsIgnoreCase("what is your name?")) {
            JOptionPane.showMessageDialog(null, "Hello there! " + "\n"
             + "My name is: " + a2.name + "\n" + "Click [Okay] below to see my picture!");
        }

        //KeyListener methods
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    //Method to paint
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //set background
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        
        //call callPaintObject
        callPaintObject(g);
    }

    public void callPaintObject(Graphics g) {
        if (a1 != null) {
            a1.paintObject(g);
            g.setColor(Color.BLUE);
            g.drawString("USE YOUR ARROW KEYS TO MOVE ME AROUND",45, 350);
        } else if (a2 != null) {
            a2.paintObject(g);
            g.setColor(Color.RED);
            g.drawString("USE YOUR ARROW KEYS TO MOVE ME AROUND",45, 350);
        }
    }
    
    //KeyListener Interface Methods
    //using
    @Override
    public void keyPressed(KeyEvent e) {
        int w = getWidth();
        int h = getHeight();
        int key = e.getKeyCode();

        //dog controls
        if (a1 != null) {
            if (key == KeyEvent.VK_LEFT) {
                a1.moveLeft(w);
            } else if (key == KeyEvent.VK_RIGHT) {
                a1.moveRight(w);
            } else if (key == KeyEvent.VK_UP) {
                a1.moveUp(h);
            } else if (key == KeyEvent.VK_DOWN) {
                a1.moveDown(h);
            }
        }

        //cat controls
        if (a2 != null) {
            if (key == KeyEvent.VK_LEFT) {
                a2.moveLeft(w);
            } else if (key == KeyEvent.VK_RIGHT) {
                a2.moveRight(w);
            } else if (key == KeyEvent.VK_UP) {
                a2.moveUp(h);
            } else if (key == KeyEvent.VK_DOWN) {
                a2.moveDown(h);
            }
        }

        repaint();
    }

    @Override
    //not using
    public void keyReleased(KeyEvent e) {}

    //not using
    @Override
    public void keyTyped(KeyEvent e) {}


    //main method
    public static void main(String[] args) {
        var frame = new JFrame("My Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setContentPane(new Main());
        frame.setVisible(true);
    }
}
