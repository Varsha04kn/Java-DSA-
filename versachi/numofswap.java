package versachi;

import java.util.Arrays;

public class numofswap {

    /**
     * Sorts an integer array using the selection sort algorithm and
     * returns the number of swaps performed.
     *
     * @param arr The array of integers to be sorted.
     * @return The total number of swaps.
     */
    public static int selectionSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Perform the swap only if the minimum element is not already in its correct position
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.println("Original array: " + Arrays.toString(numbers));

        int swaps = selectionSort(numbers);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
        System.out.println("Number of swaps: " + swaps);
    }
}
