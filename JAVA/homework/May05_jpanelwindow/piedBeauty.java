// Name: Betero Tiikana;
// Course: CS202;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

/*


3. Explain what a method is.
4. State how many methods there are in your class.
5. State the names of the methods you wrote.
6. State which method gets called first.
7. Explain the purpose of each of the parameters (first, second, third) accepted by the drawString method.
8. Explain how you selected x/y coordinates for your text.
9. Show how you compile the program from the command-line.
10. Explain the difference between a .java and a .class file.
11. Show how you run the program from the command prompt.
13. Show that your source code is neatly and consistently indented.
14. Show that your code includes at least one comment.
*/

public class piedBeauty extends JPanel {

    public/* 1st Method Defined*/piedBeauty() {

    }

    @Override
    public void/* 2nd Method Defined*/paintComponent(Graphics g) {
        /* Background Color */
        var width = getWidth();/* Built-in Method */
        var height = getHeight();/* Built-in Method */
        var addY = 20;
        g.setColor(Color.BLACK); /* Built-in Method */
        g.fillRect(0, 0, width, height); /* Built-in Method */

        /* Texts Color */
        g.setColor(Color.WHITE);
        g.drawString("I memorized this poem for Eng101", 20, 20); /* Built-in Method */

        /* Poem */
        g.setColor(Color.YELLOW);
        g.drawString("-----------PIED BEAUTY -- GERARD MANLEY HOPKINS----------", 20, 50); /* Explain Parameters */
        g.drawString("Glory be to God for dappled things –", 20, 50 + addY);
        g.drawString("For skies of couple-colour as a brinded cow;", 20, 70 + addY);
        g.drawString("For rose-moles all in stipple upon trout that swim;", 20, 90 + addY);
        g.drawString("Fresh-firecoal chestnut-falls; finches’ wings;", 20, 110 + addY);
        g.drawString("Landscape plotted and pieced – fold, fallow, and plough;", 20, 130 + addY);
        g.drawString("And áll trádes, their gear and tackle and trim.", 20, 150 + addY);
        g.drawString("All things counter, original, spare, strange;", 20, 180 + addY);/*Increased value to make empty line*/
        g.drawString("Whatever is fickle, freckled (who knows how?)", 20, 200 + addY);
        g.drawString("With swift, slow; sweet, sour; adazzle, dim;", 20, 220 + addY);
        g.drawString("He fathers-forth whose beauty is past change:", 20, 240 + addY);
        g.drawString("Praise him.", 20, 260 + addY);


    }

    public static void/* 3rd Method Defined*/main(String[] args) {
        var window = new JFrame();

        window.setSize(400, 400); /* Built-in Method */
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* Built-in Method */
        window.setContentPane(new piedBeauty()); /* Built-in Method */
        window.setVisible(true); /* Built-in Method */
    }

}
