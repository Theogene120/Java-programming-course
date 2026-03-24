import java.util.Random;
import java.util.Scanner;


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

    public static void insertionSort(int[] arr) { // insertion sort function
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // the element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // Display the sorted list
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shellSort(int[] arr) {   // Shell sort function
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Shift earlier gap-sorted elements up until the correct location is found
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // Put temp (the original arr[i]) in its correct location
                arr[j] = temp;
            }
        }

        // Display the sorted list
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] generatedList = generateRandomNumbers();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sorting algorithm (bubble / selection / insertion / shell):");
        String choice = sc.nextLine().toLowerCase();

        switch (choice) {
            case "bubble":
                bubbleSort(generatedList);
                break;
            case "selection":
                selectionSort(generatedList);
                break;
            case "insertion":
                insertionSort(generatedList);
                break;
            case "shell":
                shellSort(generatedList);
                break;
            default:
                System.out.println("Invalid choice! Array will not be sorted.");
                return;
        }

    }
}