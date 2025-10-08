package versachi;
import java.util.Arrays;
public class Merge_sort 
{
	   
	
	    public static void mergeSort(int[] arr, int left, int right) 
	    {
	        if (left < right) 
	        {
	            int mid = left + (right - left) / 2;
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);
	            merge(arr, left, mid, right);
	        }
	    }

	    /**
	     * Merges two sorted sub-arrays back into a single sorted array.
	     *
	     * @param arr   The original array.
	     * @param left  The starting index of the first sub-array.
	     * @param mid   The middle index separating the two sub-arrays.
	     * @param right The ending index of the second sub-array.
	     */
	    public static void merge(int[] arr, int left, int mid, int right) 
	    {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;
	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        for (int i = 0; i < n1; i++) 
	        {
	            L[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; j++) 
	        {
	            R[j] = arr[mid + 1 + j];
	        }

	        int i = 0, j = 0, k = left;
	        while (i < n1 && j < n2) 
	        {
	            if (L[i] <= R[j]) 
	            {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) 
	        {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        while (j < n2) 
	        {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) 
	    {
	        int[] numbers = {9, 4, 7, 6, 3, 1, 5};
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        mergeSort(numbers, 0, numbers.length - 1);

	        System.out.println("Sorted array:   " + Arrays.toString(numbers));
	    }
}

