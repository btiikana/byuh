
// Import necessary Java libraries
import java.io.FileNotFoundException; // Handles missing file errors
import javax.swing.JOptionPane; // Pops up input boxes
import javax.swing.JFrame; // Creates the window frame
import javax.swing.JPanel; // Drawing canvas/panel
import java.awt.Graphics; // Used to draw things
import java.util.Scanner; // Reads text from file
import java.awt.Color; // Lets us use different colors
import java.io.File; // Lets us open and use files

// Program name and author
// Name: Betero Tiikana
// Course: CS202

// This class draws the shapes from a file
public class ReadAndDraw extends JPanel {

    // Global variables
    int[][] xPoints; // Stores x-values for all shapes
    int[][] yPoints; // Stores y-values for all shapes
    int coordinatePairsCount; // Total number of shapes
    int fileWidth; // Width of drawing from file (first line)
    int fileHeight; // Height of drawing from file (first line)
    String fileName; // Stores the name of the file
    Scanner fileScanner; // Reads entire file
    Scanner lineScanner; // Reads line by line

    // Constructor runs when program starts
    public ReadAndDraw() {
        // Ask user to enter the file name
        fileName = JOptionPane.showInputDialog("Enter file name:");

        // Prepare to store up to 600 shapes
        xPoints = new int[600][];
        yPoints = new int[600][];
        coordinatePairsCount = 0;

        // Try to open and read the file
        try {
            fileScanner = new Scanner(new File(fileName));

            // Read the first two numbers as width and height of the original drawing
            if (fileScanner.hasNextInt()) {
                fileWidth = fileScanner.nextInt();
            }
            if (fileScanner.hasNextInt()) {
                fileHeight = fileScanner.nextInt();
            }

        } catch (FileNotFoundException e) {
            // If file doesn't exist, show error message and stop program
            JOptionPane.showMessageDialog(null, "File not found!");
            System.exit(0);
        }
    }

    // Reads all coordinates from the file (called after constructor)
    public void readFile() {
        try {
            // Skip the first line, which we already read
            if (fileScanner.hasNextLine()) fileScanner.nextLine();

            // Loop through all lines in the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineScanner = new Scanner(line); // Read one line at a time

                if (!lineScanner.hasNextInt()) continue; // Skip empty lines

                int n = lineScanner.nextInt(); // How many (x,y) pairs in this line

                int[] xArr = new int[n]; // Store x values for this shape
                int[] yArr = new int[n]; // Store y values for this shape

                // Read each (x, y) coordinate pair
                for (int i = 0; i < n; i++) {
                    xArr[i] = lineScanner.nextInt();
                    yArr[i] = lineScanner.nextInt();
                }

                // Store this shape in our big arrays
                xPoints[coordinatePairsCount] = xArr;
                yPoints[coordinatePairsCount] = yArr;
                coordinatePairsCount++; // Move to next shape
            }

        } catch (Exception e) {
            // If something goes wrong, show error and exit
            JOptionPane.showMessageDialog(null, "Error reading coordinates.");
            System.exit(0);
        }
    }

    // Draws all shapes and scales them based on window size
    public void drawLines(Graphics g) {
        int currentWidth = getWidth(); // Get current window width
        int currentHeight = getHeight(); // Get current window height

        // Loop through every shape we stored
        for (int i = 0; i < coordinatePairsCount; i++) {

            // Arrays to store scaled x and y values
            int[] responsiveWidth = new int[xPoints[i].length];
            int[] responsiveHeight = new int[yPoints[i].length];

            // Scale each x and y point based on window size
            for (int j = 0; j < xPoints[i].length; j++) {
                responsiveWidth[j] = xPoints[i][j] * currentWidth / fileWidth;
                responsiveHeight[j] = yPoints[i][j] * currentHeight / fileHeight;
            }

            // Draw this shape using scaled values
            g.drawPolyline(responsiveWidth, responsiveHeight, responsiveWidth.length);
        }
    }

    // Called automatically when window needs to draw
    @Override
    public void paintComponent(Graphics g) {
        // Set background color to black
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Change line color based on file name
        if (fileName.toLowerCase().startsWith("c")) {
            g.setColor(Color.YELLOW);
        } else if (fileName.toLowerCase().startsWith("h")) {
            g.setColor(Color.PINK);
        } else if (fileName.toLowerCase().startsWith("sq")) {
            g.setColor(Color.RED);
        } else if (fileName.toLowerCase().startsWith("su")) {
            g.setColor(Color.BLUE);
        } else if (fileName.toLowerCase().startsWith("t")) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.GREEN); // Default color
        }

        // Draw all shapes with chosen color
        drawLines(g);
    }

    // Starts the program
    public static void main(String[] args) {
        ReadAndDraw frame = new ReadAndDraw(); // Create panel and read file name
        frame.readFile(); // Load shape data from file

        // Create window and show it
        JFrame window = new JFrame("Robot Artist");
        window.setSize(frame.fileWidth, frame.fileHeight); // Set window size from file
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit when closed
        window.add(frame); // Add our drawing panel to the window
        window.setVisible(true); // Show the window
    }
}
