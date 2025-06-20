import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class TriangleDrawAndExport extends JPanel {
    private final ArrayList<Point> currentPoints = new ArrayList<>();
    private final ArrayList<int[]> drawnTriangles = new ArrayList<>();
    private final File outputFile = new File("drawing.txt");

    public TriangleDrawAndExport() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Point p = e.getPoint();
                currentPoints.add(p);
                System.out.println("Clicked: " + p.x + " " + p.y);

                if (currentPoints.size() == 3) {
                    int[] coords = {
                        currentPoints.get(0).x, currentPoints.get(0).y,
                        currentPoints.get(1).x, currentPoints.get(1).y,
                        currentPoints.get(2).x, currentPoints.get(2).y
                    };
                    drawnTriangles.add(coords);
                    saveTriangle(coords);
                    currentPoints.clear();
                    repaint();
                } else {
                    repaint(); // update in-progress points
                }
            }
        });
    }

    private void saveTriangle(int[] coords) {
        try (PrintWriter out = new PrintWriter(new FileWriter(outputFile, true))) {
            out.printf("TRIANGLE %d %d %d %d %d %d%n",
                    coords[0], coords[1],
                    coords[2], coords[3],
                    coords[4], coords[5]);
        } catch (IOException e) {
            System.err.println("Error saving triangle: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw all saved triangles
        g.setColor(Color.BLUE);
        for (int[] t : drawnTriangles) {
            g.drawLine(t[0], t[1], t[2], t[3]);
            g.drawLine(t[2], t[3], t[4], t[5]);
            g.drawLine(t[4], t[5], t[0], t[1]);
        }

        // Draw in-progress clicks as red dots
        g.setColor(Color.RED);
        for (Point p : currentPoints) {
            g.fillOval(p.x - 3, p.y - 3, 6, 6);
        }

        // Optional: Draw lines between the current 2 points
        if (currentPoints.size() == 2) {
            g.drawLine(currentPoints.get(0).x, currentPoints.get(0).y,
                       currentPoints.get(1).x, currentPoints.get(1).y);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TRIANGLE Drawer - Click 3 Times Per Shape");
        TriangleDrawAndExport panel = new TriangleDrawAndExport();
        frame.add(panel);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
