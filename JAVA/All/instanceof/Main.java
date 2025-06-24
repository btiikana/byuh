public class Main {
    public static void main(String[] args) {
        Animal myPet = new Dog();

        if (myPet instanceof Dog) {
            System.out.println("myPet is a Dog!");
            myPet.makeNoise();  // Now matches the method in Animal
        } else {
            System.out.println("Unknown animal.");
        }
    }
}
