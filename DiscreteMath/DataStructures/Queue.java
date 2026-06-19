/**
 * Queue class built with LinkedList206.
 */
public class Queue {

    LinkedList206<String> list;

    /**
     * Creates an empty queue.
     */
    public Queue() {
        list = new LinkedList206<String>();
    }

    /**
     * Adds data to the back of the queue.
     */
    public void enqueue(String data) {
        list.addToTail(data);
    }

    /**
     * Removes and returns the front of the queue.
     */
    public String dequeue() {
        if (list.isEmpty()) {
            return "empty";
        }

        return list.removeFromHead();
    }

    /**
     * Clears the queue.
     */
    public void clear() {
        list.clear();
    }

    /**
     * Prints the queue.
     */
    public void print() {
        list.printAll();
    }
}