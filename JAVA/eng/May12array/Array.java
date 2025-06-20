import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

public class Array extends JPanel {
	
    int w;
    int h;
	int[] books;
	String itemPrices;
	String[] prices;
	Point[] stars;

	public Array() {
		//Your custom initialization code here
		// books = new int[3];
		// books[0] = 1;
		// books[1] = 2;
		// books[2] = 3;
		// for (var book : books) {
		// 	System.out.println(book);

		itemPrices = "1 Dollar, 2 Dollars, 3 Dollars, 4 Dollars";
		prices = itemPrices.split(",");
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
		// Background Settings...
		w = getWidth();
		h = getHeight();
		g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

		// Print all Prices using the |--for Loop--|
		int x = 100;
		int y = 20;
		g.setColor(Color.YELLOW);
		for (var price : prices) {
			g.drawString(price, x, y);
			y += 20;
		}

		// Drawing stars

	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Array());
		window.setVisible(true);
	}
}
