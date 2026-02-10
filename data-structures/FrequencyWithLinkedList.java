import java.util.LinkedList;
import java.util.Random;

public class FrequencyWithLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        // Step 1: Add 50 random numbers (1–20) to LinkedList
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(20) + 1);
        }

        // Step 2: Print the LinkedList
        System.out.println("Generated numbers:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nChecking frequency...\n");

        // Step 3: Count frequency using another array (helper)
        int[] count = new int[21];

        for (int num : list) {
            count[num]++;
        }

        // Step 4: Check for numbers appearing 25+ times
        boolean found = false;

        for (int i = 1; i <= 20; i++) {
            if (count[i] >= 25) {
                System.out.println("Number " + i + " appears " + count[i] + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No number appeared 25 or more times.");
        }
    }
}

