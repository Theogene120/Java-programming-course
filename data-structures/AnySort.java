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

    public static void bubbleSort(int[] arr) {    // Bubble sort function
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Display the sorted list
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    
    public static void selectionSort(int[] arr) {  // Selection sort function
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        // Display the sorted list
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] generatedList = generateRandomNumbers();
        
        selectionSort(generatedList);
    }
}