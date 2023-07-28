//  Using LinkedList as a stack (LIFO - Last In, First Out)

import java.util.LinkedList;

public class LinkedListExample4 {
    public static void main(String[] args) {
        // Create a LinkedList to act as a stack
        LinkedList<Integer> stack = new LinkedList<>();

        // Adding elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Removing and processing elements from the stack
        System.out.println("Processing elements from the stack:");
        while (!stack.isEmpty()) {
            int element = stack.pop(); // Removes and retrieves the last element added to the stack
            System.out.println("Processing element: " + element);
        }
    }
}
