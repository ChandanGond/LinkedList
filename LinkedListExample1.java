import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements from the LinkedList
        System.out.println("Names in the LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
