import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
public class FunWithPokemon extends JPanel{

    private Pichu ej;
    private Pokemon rylan;
    private Pokemon billy;

    public FunWithPokemon() {
        ej = new Pichu("Ej's pet pichu");
        rylan = new Pokemon("Rylan's pet", 39);
        billy = new Pokemon("Rylan's pet", 45);
        ej.talk();
        rylan.talk();
        ej.setPicture("pichu.png");
        //rylan.setPicture("Charmander.png");
        rylan.move(200, 50);
        billy.move(50, 300);
    }

    @Override
    public void paintComponent(Graphics g) {
        ej.draw(g);
        rylan.draw(g);
        billy.draw(g);
    }

    public static void main(String[] args) {
        //Custom rendering code here
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new FunWithPokemon());
        window.setVisible(true);

    }
}
