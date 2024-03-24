package stackAndQueue;

public class StringQueue {

    private final String[] items;
    private int front, rear, capacity;

    public StringQueue(int capacity) {
        this.capacity = capacity;
        items = new String[capacity];
        front = rear = -1; // Initially empty queue
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    // Add (enqueue) a new element to the queue
    public void enqueue(String name, String surname) {
        if (isFull()) {
            throw new IllegalStateException("Queue overflow");
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity; // Circular approach to handle overflow
        items[rear] = name + "," + surname; // Combine name and surname
    }

    // Remove (dequeue) the first element from the queue
    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow");
        }
        String pair = items[front];
        if (front == rear) { // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return pair;
    }

    // Get the current size of the queue
    public int getSize() {
        if (isEmpty()) {
            return 0;
        }
        return (rear + 1) % capacity; // Account for circular approach
    }

    public static void main(String[] args) {
        StringQueue queue = new StringQueue(3);

        // Enqueue elements
        queue.enqueue("John", "Doe");
        queue.enqueue("Jane", "Smith");
        queue.enqueue("Alice", "Johnson");

        // Print the queue size (should be 3)
        System.out.println("Queue size: " + queue.getSize());

        // Dequeue elements until empty
        while (!queue.isEmpty()) {
            String pair = queue.dequeue();
            System.out.println("Dequeued: " + pair);
        }
    }
}

