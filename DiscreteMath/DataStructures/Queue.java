/**
 * r3
 */
public class Queue {

    LinkedList206<String> list;

    /**
     * Constructor
     */
    public Queue() {
        list = new LinkedList206<String>();
    }

    /**
     * r3
     */
    public void enqueue(String data) {
        list.addToTail(data);
    }

    /**
     * r3
     */
    public String dequeue() {
        if (list.isEmpty()) {
            return "empty";
        }

        return list.removeFromHead();
    }

    /**
     * Clear
     */
    public void clear() {
        list.clear();
    }

    /**
     * Print
     */
    public void print() {
        list.printAll();
    }
}