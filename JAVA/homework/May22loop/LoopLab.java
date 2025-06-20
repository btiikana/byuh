/*
Name: Betero Tiikana
Course: CS202 Sec01
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

public class LoopLab extends JPanel {

    int n;
    int w;
    int h;
    int boxWidth;
    int boxHeight;
    int numbers;
    boolean tableTypeInput;

//----------2nd Main section of the program -- Constructor/Initializer----------
    public LoopLab() {
        // Table size from user's input
        String inputSize = JOptionPane.showInputDialog("Enter table size (example: '10' for a 10x10)");
        n = Integer.parseInt(inputSize);

        // Table type from user's input
        String inputType = JOptionPane.showInputDialog("Choose Table Type: [M]ultiplication or [A]ddition");
        //As long the n == 'A' || n == 'a'
        tableTypeInput = inputType.equalsIgnoreCase("A");

    }

//----------3rd Main section of the program -- Coloring class----------
    @Override
    public void paintComponent(Graphics g) {
        // Total width and height of the window, allowing responsive sizes for each cell.
        w = getWidth();
        h = getHeight();

        // Divide total width and height by the user's input
        //600 divided by user's input..
        boxWidth = w / n;
        boxHeight = h / n;

        //Fill first row with YELLOW
        g.setColor(Color.GREEN);
        for (int i = 0; i < n; i++) {
            g.fillRect(i * boxWidth, 0, boxWidth, boxHeight); // top row
        }

        // Fill first column with RED
        g.setColor(Color.RED);
        for (int j = 0; j < n; j++) {
            g.fillRect(0, j * boxHeight, boxWidth, boxHeight); // left column
        }

        // Call tableSetup() after initiating the filling of first row and first column
        tableSetup(g);
    }

    //4th Main section of the program --Core for Coloring and drawing numbers.
    public void tableSetup(Graphics g) {
        int x = 0;
        int y = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (tableTypeInput) {
                    numbers = i + j - 1;
                } else {
                    numbers = i * j;
                }
                g.setColor(Color.BLACK);
                g.drawRect(x, y, boxWidth, boxHeight); // Draw box
                g.drawString("" + numbers, x, y); // Draw numbers

                x += boxWidth;
            }
            y += boxHeight;
            x = 0;
        }
    }

//----------1st Main Section of the program -- main() method----------
    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 600);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }
}
