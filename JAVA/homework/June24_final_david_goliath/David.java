import javax.swing.ImageIcon;

public class David extends Sprite{

    //fields to track the stones David is collecting
    private int numStones;
    
    //default constructor
    public David() {
        super();
        icon = new ImageIcon("david.png");
        numStones = 0;
    }

    //method to increment numStones being carried by david
    public void pickUpStone() {
        numStones++;
    }

    //method that checks if david is carrying 5 stones
    public boolean isArmed() {
        
        if (numStones == 5) {
            return true;
        } else {
            return false;
        }
    }

    // method to reset numStones
    public void reset() {
        numStones = 0; 
    }
}
