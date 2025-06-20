public class CleaningRobot extends Robot implements Chargable {

    public CleaningRobot(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is moving to clean the next room...");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging at the dock.");
    }
}

