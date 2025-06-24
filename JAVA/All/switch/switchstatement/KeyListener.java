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

        //example of using switch statement on keypress method from KeyListener class
        switch (key) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                sprite.moveNorth(); //moves david and goliath
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                sprite.moveSouth();
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                sprite.moveWest();
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                sprite.moveEast();
                break;
            default:
                System.out.println("Please use an arrow key or awds.");
                break;
        }
    }
}
