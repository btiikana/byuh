import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Getter {
    
//get the goal

    //fields
    public String firstGoal;
    public String secondGoal;
    public String thirdGoal;
    private ArrayList<String> goals = new ArrayList<>();

    //initializer block
    {
        goals.add("Land a Data Engineer Job after College.");
        goals.add("Buy a home.");
        goals.add("Retire.");
    }

    //default contructor
    public Getter() {
    }

    public void getDisplayGoals() {
        firstGoal = goals.get(0);
        secondGoal = goals.get(1);
        thirdGoal = goals.get(2);
    }

    public void printGoals(Setter s) {
        System.out.println("I know that when I complete all the requirements: ");
        System.out.println(s);
        System.out.println("I will land a DATA ENGINEERING JOB!!");
    }

}
