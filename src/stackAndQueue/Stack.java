package stackAndQueue;

public class Stack {
    private static class Node {
        double x;
        double y;
        Node next;

        public Node(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    private Node top; // Pointer to the top element

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push (add) an element to the top of the stack
    public void push(double x, double y) {
        Node newNode = new Node(x, y);
        newNode.next = top;
        top = newNode;
    }

    // Pop (remove) the top element from the stack
    public double[] pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        double[] popped = {top.x, top.y};
        top = top.next;
        return popped;
    }

    // Peek (return) the top element without removing it
    public double[] peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return new double[]{top.x, top.y};
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(1.5, 2.3);
        stack.push(4.8, 1.2);
        stack.push(7.1, -5.9);

        // Print the top element without removing it
        System.out.println("Top element (peek): " + java.util.Arrays.toString(stack.peek()));

        // Pop elements and print them
        while (!stack.isEmpty()) {
            double[] popped = stack.pop();
            System.out.println("Popped element: (" + popped[0] + ", " + popped[1] + ")");
        }
    }
}
