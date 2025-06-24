public class Main {

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        //key control buttons for Mr. David
        // if (key == KeyEvent.VK_UP) {
        //     david.moveNorth();
        //     System.out.println("David moves UP");
        // } else if (key == KeyEvent.VK_DOWN) {
        //     david.moveSouth();
        //     System.out.println("David moves DOWN");
        // } else if (key == KeyEvent.VK_LEFT) {
        //     david.moveWest();
        //     System.out.println("David moves LEFT");
        // } else if (key == KeyEvent.VK_RIGHT) {
        //     david.moveEast();
        //     System.out.println("David moves RIGHT");
        // }


        //exmaple of switch expression
        switch (key) {
        case KeyEvent.VK_UP    -> {
            david.moveNorth();
            System.out.println("David moves UP");
        }
        case KeyEvent.VK_DOWN  -> {
            david.moveSouth();
            System.out.println("David moves DOWN");
        }
        case KeyEvent.VK_LEFT  -> {
            david.moveWest();
            System.out.println("David moves LEFT");
        }
        case KeyEvent.VK_RIGHT -> {
            david.moveEast();
            System.out.println("David moves RIGHT");
        }
    }
}
