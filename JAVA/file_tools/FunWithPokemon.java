import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class FunWithPokemon extends JPanel {

    private Pichu ej;
    private Charmander rylan;
    private Bulbasaur billy;

    public FunWithPokemon() {
        ej = new Pichu("EJ's pet pichu");
        rylan = new Charmander("Rylan's pet charmander");
        billy = new Bulbasaur("Billy's pet bulbasaur");
        ej.talk();
        rylan.talk();
        rylan.move(200, 50);
        billy.move(50, 300);
        Pokemon winner = rylan.battle(billy);
        System.out.println("A message from the winner:");
        winner.talk();
    }

    @Override
    public void paintComponent(Graphics g) {
        ej.draw(g);
        rylan.draw(g);
        billy.draw(g);
    }

    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setContentPane(new FunWithPokemon());
        window.setVisible(true);
    }
}