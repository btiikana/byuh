import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class ParallelArrays extends JPanel {

    final int size;
    String[] name;
    int[] age;
    double[] grade;
	
	public ParallelArrays() {
        size = 5;
        name = new String[size];
        age = new int[size];
        grade = new double[size];

        //Populate the Arrays
        name[0] = "Betero Tiikana";
        name[1] = "T Tiikana";
        name[2] = "D Tiikana";
        name[3] = "T Tiikana";
        name[4] = "R Tiikana";
        age[0] = 30;
        age[1] = 29;
        age[2] = 2;
        age[3] = 1;
        age[4] = 35;
        grade[0] = 3.73;
        grade[1] = 3.5;
        grade[2] = 4.0;
        grade[3] = 4.0;
        grade[4] = 3.5;
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
        System.out.println("All Students");
        for (int i=0; i<size; i++) {
            if (age[i] >= 29 && age[i] <= 30) {
                System.out.println("Name: " + name[i] + " Age: " + age[i] + " Grade: " + grade[i]);
            }
        }
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new ParallelArrays());
		window.setVisible(true);
	}
}

