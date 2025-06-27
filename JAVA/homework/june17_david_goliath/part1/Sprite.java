import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Sprite {
    
    //fields
    protected Room currentRoom;
    protected ImageIcon image;

    //default constructor
    public Sprite() {
        currentRoom = null;
        image = null;
    }

    //setter method for currentRoom
    public void setCurrentRoom(Room r) {
        this.currentRoom = r;
    }

    //getter method for currentRoom
    public Room getCurrentRoom() {
        return currentRoom;
    }

    //draw method for sprite in currentRoom
    public void draw(Graphics g) {
        if (currentRoom != null && image != null) {
            //get current room postion
            Point pos = currentRoom.getPosition();

            // image size
            Image img = image.getImage();
            int imgWidth = img.getWidth(null);
            int imgHeight = img.getHeight(null);

            // place image in center
            int x = pos.x + (80 - imgWidth) / 2;
            int y = pos.y + (120 - imgHeight) / 2;

            g.drawImage(img, x, y, null);
        }
    }
}
