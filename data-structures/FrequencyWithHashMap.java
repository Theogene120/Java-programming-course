import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FrequencyWithHashMap {

    public static void main(String[] args) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        Random random = new Random();

        // Step 1: Generate random numbers and count frequency
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(20) + 1;

            // if number exists, increase count; otherwise start from 1
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print frequency table
        System.out.println("Frequency table:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " → " + entry.getValue() + " times");
        }

        System.out.println("\nNumbers that appear 25 or more times:\n");

        boolean found = false;

        // Step 3: Check numbers that appear 25+ times
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= 25) {
                System.out.println("Number " + entry.getKey()
                        + " appears " + entry.getValue() + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No number appeared 25 or more times.");
        }
    }
}
