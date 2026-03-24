import java.util.Random;

public class AnySort {

    public static int[] generateRandomNumbers() {
            Random rand = new Random();
            int[] numbers = new int[5];

            for (int i = 0; i < 5; i++) {
                numbers[i] = rand.nextInt(1000) + 1; // range 1–1000
            }

            return numbers;
        }

    public static void main(String[] args) {
        int[] res = generateRandomNumbers();
        System.out.println(res);
    }
}