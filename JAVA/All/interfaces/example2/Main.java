public class Main {
    public static void main(String[] args) {
        CleaningRobot robo = new CleaningRobot("Dusty");

        robo.sayHello();  // regular method from abstract class
        robo.move();      // abstract method overridden
        robo.charge();    // from interface
    }
}
