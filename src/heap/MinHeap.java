package heap;

public class MinHeap {

    private int[] heap;
    private int heapSize;
    private static final int MAX_HEAP_SIZE = 100;

    public MinHeap() {
        heap = new int[MAX_HEAP_SIZE];
        heapSize = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private boolean isLeaf(int i) {
        return left(i) >= heapSize;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Function to insert a new element into the heap
    public void insert(int key) {
        if (heapSize == MAX_HEAP_SIZE) {
            System.out.println("Heap overflow");
            return;
        }

        heap[heapSize] = key;
        heapSize++;

        int current = heapSize - 1;

        // Heapify up to maintain min-heap property
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Function to extract the minimum element (root) from the heap
    public int extractMin() {
        if (heapSize == 0) {
            System.out.println("Heap underflow");
            return -1;
        }

        int min = heap[0];

        // Move the last element to the root
        heap[0] = heap[heapSize - 1];
        heapSize--;

        // Heapify down to maintain min-heap property
        int current = 0;
        while (!isLeaf(current)) {
            int smallest = current;
            int leftChild = left(current);
            int rightChild = right(current);

            if (leftChild < heapSize && heap[leftChild] < heap[smallest]) {
                smallest = leftChild;
            }

            if (rightChild < heapSize && heap[rightChild] < heap[smallest]) {
                smallest = rightChild;
            }

            if (smallest != current) {
                swap(current, smallest);
                current = smallest;
            } else {
                break;
            }
        }

        return min;
    }

    // Utility function to print the heap
    public void printHeap() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        minHeap.insert(3);
        minHeap.insert(5);
        minHeap.insert(9);
        minHeap.insert(6);
        minHeap.insert(8);
        minHeap.insert(20);
        minHeap.insert(10);
        minHeap.insert(12);
        minHeap.insert(18);
        minHeap.insert(9);

        System.out.println("Min-heap: ");
        minHeap.printHeap();

        int minElement = minHeap.extractMin();
        System.out.println("Extracted minimum element: " + minElement);

        System.out.println("Min-heap after extraction: ");
        minHeap.printHeap();

        minHeap.insert(4);
        System.out.println("Min-heap after inserting 4: ");
        minHeap.printHeap();
    }
}
