import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class AlohaFriday extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        g.drawString("It's Aloha Friday!", 20, 20 );
        g.drawString("fav day!", 20, 40 );
        // Ignored by a compiler
    }

    public static void main(String[] args) {
        var window = new JFrame();
        window.setSize(200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new AlohaFriday());
        window.setVisible(true);
    }

}


