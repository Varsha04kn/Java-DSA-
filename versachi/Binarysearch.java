package versachi;

public class Binarysearch 
{
	public static int binarySearch(int[] arr, int target)
	{
		int start = 0;
        int end = arr.length - 1;

        while (start <= end) 
        {
            int mid = (start+end)/2;
            if (arr[mid] == target) 
            {
                return mid; 
            }

            if (arr[mid] < target) 
            {
                start = mid + 1; 
            } 
            else 
            {
                end = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) 
    {
        int[] sortedArr = {1, 3, 5, 6, 7, 8, 9, 15};
        int targetValue = 10;
        int result = binarySearch(sortedArr, targetValue);

        if (result == -1) 
        {
            System.out.println("Element " + targetValue + " not found in the array.");
        } 
        else 
        {
            System.out.println("Element " + targetValue + " found at index: " + result);
        }
	}
}