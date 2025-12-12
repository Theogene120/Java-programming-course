import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will not be added

        // Display Set
        System.out.println("Fruits Set: " + fruits);

        // Check if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removal: " + fruits);

        // Iterate over Set
        System.out.println("Iterating over Set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of Set
        System.out.println("Size of Set: " + fruits.size());

        // Clear Set
        fruits.clear();
        System.out.println("Is Set empty? " + fruits.isEmpty());
    }
}

