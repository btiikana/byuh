import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;

// Name: Betero Tiikana
// Course: CS202

// ArraysLab Class
public class ArraysLab extends JPanel {

    // Global variables or Fields
    File fileName;
    int fileWidth;
    int fileHeight;
    String selectedFile;
    int[][] xPoints;
    int[][] yPoints;
    Scanner fileScanner;
    int xYCount = 0;

    // Second main section of the program --> Variable declaration and handles file name request in try and catch
    // Constructor
    public ArraysLab() {
        JFileChooser chooseFile = new JFileChooser();
        int targetFile = chooseFile.showOpenDialog(null);
        if (targetFile == JFileChooser.APPROVE_OPTION) {
            fileName = chooseFile.getSelectedFile(); 
            selectedFile = fileName.getName(); 
        } else {
            JOptionPane.showMessageDialog(null, "No file selected. Exiting.");
            System.exit(0);
        }
        xPoints = new int[1000][];
        yPoints = new int[1000][];
    }

    //Third main section of the program --> Reads file in try and catch
    public void readFile() {
        try {
            fileScanner = new Scanner(fileName);

            // Get width and height from the file
            if (fileScanner.hasNextInt()) {
                fileWidth = fileScanner.nextInt();
            }
            if (fileScanner.hasNextInt()) {
                fileHeight = fileScanner.nextInt();
            }

            // Loop through the rest of the file
            while (fileScanner.hasNextInt()) {
                int n = fileScanner.nextInt();
                int xArray[] = new int[n];
                int yArray[] = new int[n];

                for (int i = 0; i < n; i++) {
                    // Make sure the next values exist
                    if (fileScanner.hasNextInt()) {
                        xArray[i] = fileScanner.nextInt();
                    }
                    if (fileScanner.hasNextInt()) {
                        yArray[i] = fileScanner.nextInt();
                    }
                }

                // Store the arrays
                xPoints[xYCount] = xArray;
                yPoints[xYCount] = yArray;
                xYCount++;
            }

        } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Invalid file, try again!");
                System.exit(0);
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error reading coordinates, check the file values");
                System.exit(0);
        }
    }

    //Fifth main section of the program --> Draw shapes and scale them up and down according to window size
    public void drawLines(Graphics g) {
        int currentWidth = getWidth();
        int currentHeight = getHeight();

    for (int i = 0; i < xYCount; i++) {
        int pointsCount = xPoints[i].length;
        int newX[] = new int[pointsCount];
        int newY[] = new int[pointsCount];
        for (int j = 0; j < pointsCount; j++) {
            newX[j] = xPoints[i][j] * currentWidth / fileWidth;
            newY[j] = yPoints[i][j] * currentHeight / fileHeight;
        }
        g.drawPolyline(newX, newY, pointsCount);
        }
    }

    //Fourth main section of the program --> Core for coloring and settings up background
    @Override
    public void paintComponent(Graphics g) {
        // Set background color to black
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Change poly line color based on file name
        if (selectedFile.toLowerCase().startsWith("c")) {
            g.setColor(Color.YELLOW);
        } else if (selectedFile.toLowerCase().startsWith("h")) {
            g.setColor(Color.PINK);
        } else if (selectedFile.toLowerCase().startsWith("sq")) {
            g.setColor(Color.RED);
        } else if (selectedFile.toLowerCase().startsWith("su")) {
            g.setColor(Color.BLUE);
        } else if (selectedFile.toLowerCase().startsWith("tr")) {
            g.setColor(Color.WHITE);
        }else if (selectedFile.toLowerCase().startsWith("te")) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.GREEN); // Default color
        }

        // Draw all shapes with chosen color
        drawLines(g);
    }

    // First main section of the program --> starts program
    public static void main(String[] args) {
        ArraysLab frame = new ArraysLab(); // Create panel
        frame.readFile(); // Load shapes/xArray and yArray

        // Set up the window
        JFrame window = new JFrame("Robot Artist");
        window.setSize(frame.fileWidth, frame.fileHeight);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(frame);
        window.setVisible(true);
    }
}
