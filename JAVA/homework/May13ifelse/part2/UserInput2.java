import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

// RUBRIC
// 2 points) Explain what a field is. 
// (2 points) Explain what scope means.
// (2 points) Explain how a field is different from a local variable, in terms of scope.
// (1 point) Explain how you convert the user's age from a string to an integer.
// (1 point) Explain how you determine which age group the user belongs to.
// (1 point) Explain how you catch bad (negative or too high) input.
// (2 points) Demonstrate that your program presents the correct output for YW classes.
// (2 points) Demonstrate that your program presents the correct output for YM quorums.
// (1 point) Demonstrate that your program accepts both uppercase ('M' and 'F') and lowercase ('m' and 'f') input.
// (1 point) Demonstrate that your program displays an appropriate error message for invalid age ranges.
// (1 point) Demonstrate that your program displays an appropriate error message for genders other than M or F.
// (1 point) Show that each major section of the program is commented.
// (1 point) Show that your source code is neatly and consistently indented. 
// (1 point) Show that all your variable and method names start with a lowercase letter.
// (1 point) Show that all your class names start with an uppercase letter.

// Recording Male Church Members Program
public class UserInput2 extends JPanel {
    
    String genderInput;
    int age; // Convert String Input to Integer
    ImageIcon rockchapel; // age 0 - 11
    ImageIcon deacon; // age 12 - 13
    ImageIcon teacher; // age 14 - 15
    ImageIcon priest; // age 16 - 17
    ImageIcon equorum; // age 18 - 119

    // Main section of the program
    public UserInput2() {
    // Constructor
    // Check for Gender
        genderInput = JOptionPane.showInputDialog("Choose Gender: [M]ale or [F]emale");
        
        // Using textblocks --> showMessageDialog(null, "message") method...
        if (genderInput.equalsIgnoreCase("f")) {
            JOptionPane.showMessageDialog(null,
            "If you are a FEMALE go to the chapel!");
            System.exit(0);
        }

        // Using showInputDialog("Message") method...
        String input = JOptionPane.showInputDialog("How old are you?");
        age = Integer.parseInt(input);
        rockchapel = new ImageIcon("rockchapel.png");
        deacon = new ImageIcon("deacon.jpg");
        teacher = new ImageIcon("teacher.jpg");
        priest = new ImageIcon("priest.jpg");
        equorum = new ImageIcon("elders.jpg");
    }
    // Main section of the program
    @Override
    public void paintComponent(Graphics g) {
        // Background Settings
        var w = getWidth();
        var h = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

    // Main program methods(Pictures and strings)
        // Age Group: 0 - 11
        if (age >= 0 && age < 12) {
            rockchapel.paintIcon(null, g, 135, 90);
            g.setColor(Color.GREEN);
            g.drawString("You go to primary!", 147, 230);
        } 

        // Age Group: 12 - 13
        else if (age >= 12 && age <= 13) {
            deacon.paintIcon(null, g, 140, 25);
            g.setColor(Color.GREEN);
            g.drawString("You belong to the Deacons quorum.", 90, 240);
        }

        // Age Group: 14 - 15
        else if (age >= 14 && age <= 15) {
            teacher.paintIcon(null, g, 140, 25);
            g.setColor(Color.GREEN);
            g.drawString("You belong to the Teachers quorum.", 90, 240);
        }

        // Age Group: 16 - 17
        else if (age >= 16 && age <= 17) {
            priest.paintIcon(null, g, 140, 25);
            g.setColor(Color.GREEN);
            g.drawString("You belong to the Priests quorum.", 93, 245);
        }

        // Age Group: 18 - 119
        else if (age >= 18 && age <= 119) {
            equorum.paintIcon(null, g, 130, 25);
            g.setColor(Color.GREEN);
            g.drawString("You belong to the Elders quorum.", 103, 240);
        } else {
            g.setColor(Color.RED);
            g.drawString("Are you sure you typed that correctly?", 90, 50);
            g.drawString("Make Sure your Age is CORRECT and TRY AGAIN!!", 150, 80);
        }
    }

    // Main Section of  the Program..
    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
		window.setContentPane(new UserInput2());
		window.setVisible(true);
    }
}