// Using LinkedList as a queue (FIFO - First In, First Out)

import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        // Create a LinkedList to act as a queue
        LinkedList<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Removing and processing elements from the queue
        System.out.println("Processing elements from the queue:");
        while (!queue.isEmpty()) {
            int element = queue.poll(); // Removes and retrieves the first element in the queue
            System.out.println("Processing element: " + element);
        }
    }
}
