package versachi;
import java.util.Arrays;

public class MergeSortedArrays {

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param arr1 The first sorted array.
     * @param arr2 The second sorted array.
     * @return A new array containing all elements from both input arrays, sorted.
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for mergedArray

        // Main loop to compare and merge elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy any remaining elements from arr1
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy any remaining elements from arr2
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 19, 34};
        int[] array2 = {2, 4, 8, 12, 17, 19};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] merged = merge(array1, array2);

        System.out.println("\nMerged and sorted array: " + Arrays.toString(merged));
    }
}



