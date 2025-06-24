public class AndroidPhone extends Phone {

    @Override
    public void showWelcomeMessage() {
        System.out.println("Welcome to Android!");
    }

    @Override
    public void connectNetwork() {
        System.out.println("Connecting to Wi-Fi and mobile data...");
    }
}
