import java.util.Scanner;

/**
 * Main logic
 */
public class Main implements Program {

    Stack stack;
    Queue queue;
    String mode;

    /**
     * Constructor
     */
    public Main() {
        stack = new Stack();
        queue = new Queue();
        mode = "";
    }

    /**
     * Main caller
     */
    public static void main(String[] args) {
        Main program = new Main();
        program.start();
    }

    /**
     * Main logic
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.trim();

            if (line.equals("")) {
                continue;
            }

            if (line.equals("***")) {
                break;
            }

            processLine(line);
        }

        scanner.close();
    }

    /**
     * Parse input
     */
    public void processLine(String line) {
        String[] parts = line.split(" ");
        String command = parts[0];

        if (command.equals("PUSH")) {
            mode = "stack";
            pushCommand(parts);
        } else if (command.equals("POP")) {
            mode = "stack";
            popCommand();
        } else if (command.equals("ENQUEUE")) {
            mode = "queue";
            enqueueCommand(parts);
        } else if (command.equals("DEQUEUE")) {
            mode = "queue";
            dequeueCommand();
        } else if (command.equals("CLEAR")) {
            clearCommand();
        } else if (command.equals("PRINT")) {
            printCommand();
        }
    }

    /**
     * r4
     */
    public void pushCommand(String[] parts) {
        String value = parts[1];

        stack.push(value);
    }

    /**
     * r4
     */
    public void popCommand() {
        String value = stack.pop();

        System.out.println(value);
    }

    /**
     * r6
     */
    public void enqueueCommand(String[] parts) {
        String value = parts[1];

        queue.enqueue(value);
    }

    /**
     * r6
     */
    public void dequeueCommand() {
        String value = queue.dequeue();

        System.out.println(value);
    }

    /**
     * mct
     */
    public void clearCommand() {
        if (mode.equals("stack")) {
            stack.clear();
        } else if (mode.equals("queue")) {
            queue.clear();
        } else {
            stack.clear();
            queue.clear();
        }
    }

    /**
     * mct
     */
    public void printCommand() {
        if (mode.equals("stack")) {
            stack.print();
        } else if (mode.equals("queue")) {
            queue.print();
        }
    }
}