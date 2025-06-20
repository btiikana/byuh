import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    
    //fields
    private Setter require;
    private Getter goal;

    //constructor
    public Main() {
    }

    public static void main(String[] args) {
        Setter require = new Setter();
        require.setDisplayRequirements();
        require.setChangeRequirement("Learn Trading");
        require.printRequirements();

        Getter goal = new Getter();
        goal.getDisplayGoals();
        goal.printGoals(require);
    }
}
