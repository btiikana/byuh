import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.awt.Color;

public class FunWithPokemon extends JPanel implements MouseListener {

    private Pichu ej;
    private Pichu taren;
    private Charmander rylan;
    private Bulbasaur billy;
    private List<Pokemon> pokestop;

    public FunWithPokemon() {
        //addMouseListener(new EJ());
        addMouseListener(this);
        //pokestop = new ArrayList<>();
        ej = new Pichu("EJ's pet pichu");
        taren = new Pichu("Taren's very own pichu", 25);
        rylan = new Charmander("Rylan's pet charmander");
        billy = new Bulbasaur("Billy's pet bulbasaur");
        //Pokemon stratton = new Pokemon("This won't work", 50);
        ej.talk();
        taren.talk();
        rylan.talk();
        billy.talk();
        rylan.move(200, 50);
        billy.move(50, 300);
        taren.move(300, 310);
        pokestop = List.of(ej, taren, rylan, billy);
        // pokestop.add(ej);
        // pokestop.add(taren);
        // pokestop.add(rylan);
        // pokestop.add(billy);
        //Pokemon winner = rylan.battle(billy);
        //System.out.println("A message from the winner:");
        //winner.talk();
    }

    public void background(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    @Override
    public void paintComponent(Graphics g) {
        int w = getWidth();
        background(g);
        for (var p : pokestop) {
            p.draw(g);
        }
    }

    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,650);
        window.setContentPane(new FunWithPokemon());
        window.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        for (var p : pokestop) {
            if (p.contains(x, y)) {
                p.talk();
                break;
            }
        }
        System.out.println("You just pressed the mouse button at ("+ x + "," + y + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You just let go of the mouse button");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("The mouse arrow just entered the window");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("The mouse arrow just left the window");
    }
}