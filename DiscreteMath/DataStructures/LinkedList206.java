/**
 * Custom linked list class used by Stack and Queue.
 */
public class LinkedList206<T> {

    Node206<T> head;
    int size;

    /**
     * Creates an empty linked list.
     */
    public LinkedList206() {
        head = null;
        size = 0;
    }

    /**
     * Adds a new node to the front of the list.
     */
    public void addToHead(T data) {
        Node206<T> newNode = new Node206<T>(data);

        newNode.next = head;
        head = newNode;

        size++;
    }

    /**
     * Adds a new node to the end of the list.
     */
    public void addToTail(T data) {
        Node206<T> newNode = new Node206<T>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node206<T> current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    /**
     * Removes and returns the first node.
     */
    public T removeFromHead() {
        T result = head.data;

        head = head.next;
        size--;

        return result;
    }

    /**
     * Removes and returns the last node.
     */
    public T removeFromTail() {
        T result;

        if (head.next == null) {
            result = head.data;
            head = null;
            size--;

            return result;
        }

        Node206<T> current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        result = current.next.data;
        current.next = null;
        size--;

        return result;
    }

    /**
     * Checks if the list is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Clears the list.
     */
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Prints the list from head to tail.
     */
    public void printAll() {
        Node206<T> current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}