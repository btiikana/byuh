public abstract class Phone implements Connectable {

    public void powerOn() {
        System.out.println("Powering on the phone...");
        showWelcomeMessage();   // 🔹 Hook method
        connectNetwork();       // 🔸 Required by interface
        System.out.println("Phone is ready to use.\n");
    }

    // 🪝 Hook method (optional override)
    public void showWelcomeMessage() {
        // Default: no message
    }
}
