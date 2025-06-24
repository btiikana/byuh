public class FlipPhone extends Phone {

    @Override
    public void connectNetwork() {
        System.out.println("Connecting to mobile network only...");
    }

    // Doesn't override the hook – no welcome message
}
