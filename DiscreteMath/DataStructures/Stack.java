/**
 * Stack class built with LinkedList206.
 */
public class Stack {

    LinkedList206<String> list;

    /**
     * Creates an empty stack.
     */
    public Stack() {
        list = new LinkedList206<String>();
    }

    /**
     * Adds data to the top of the stack.
     */
    public void push(String data) {
        list.addToTail(data);
    }

    /**
     * Removes and returns the top of the stack.
     */
    public String pop() {
        if (list.isEmpty()) {
            return "empty";
        }

        return list.removeFromTail();
    }

    /**
     * Clears the stack.
     */
    public void clear() {
        list.clear();
    }

    /**
     * Prints the stack.
     */
    public void print() {
        list.printAll();
    }
}