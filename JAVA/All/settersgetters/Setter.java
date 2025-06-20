import java.util.*;


public class Setter {

//set the plan

    //fields
    public String firstRequirement;
    public String secondRequirement;
    public String thirdRequirement;
    public String finalRequirement;
    private ArrayList<String> requirements = new ArrayList<>();

    //initializer block
    {
        requirements.add("Finish Data Zoomcamp");
        requirements.add("Learn Hadoop");
        requirements.add("B.S Computer Science");
        requirements.add("Unknown");
    }
    
    //dfault constructor
    public Setter () {
    }

    public void setChangeRequirement(String finalRequirement) {
        this.finalRequirement = finalRequirement;
    }

    public void setDisplayRequirements() {
        firstRequirement = requirements.get(0);
        secondRequirement = requirements.get(1);
        thirdRequirement = requirements.get(2);
        finalRequirement = requirements.get(3);
    }

    public void printRequirements() {
        System.out.println("I plan to " + firstRequirement + " in less than 2 months");
        System.out.println("And it only makes sense to transition from " + firstRequirement + " to learning and perfecting " + secondRequirement);
        System.out.println("While I juggle between individual coursework, I intend on getting a " + thirdRequirement + " and hoping to complete college in less than 4 years.");
        System.out.println("And after I complete everything, I will readjust and perhaps..." + finalRequirement + "\n");
    }

    @Override
    public String toString() {
        return "" + firstRequirement + ", " + secondRequirement + ", " + thirdRequirement + ", " + "Optional: " + finalRequirement + "";
    }
    
}
