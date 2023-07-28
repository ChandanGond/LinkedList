import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Removing elements from the LinkedList
        numbers.remove(2); // Removes the element at index 2 (30)

        // Accessing elements from the LinkedList after removal
        System.out.println("Remaining elements in the LinkedList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
