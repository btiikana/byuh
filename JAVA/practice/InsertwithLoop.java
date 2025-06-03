import javax.swing.*;
import java.awt.*;

public class InsertwithLoop extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int rows = 3;
        int cols = 3;
        int cellWidth = getWidth() / cols;
        int cellHeight = getHeight() / rows;

        // Draw horizontal lines
        for (int i = 0; i <= rows; i++) {
            g.drawLine(0, i * cellHeight, getWidth(), i * cellHeight);
        }

        // Draw vertical lines
        for (int j = 0; j <= cols; j++) {
            g.drawLine(j * cellWidth, 0, j * cellWidth, getHeight());
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("3x3 Table");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new InsertwithLoop());
        window.setVisible(true);
    }
}
