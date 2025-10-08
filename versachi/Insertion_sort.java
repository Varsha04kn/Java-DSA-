package versachi;
import java.util.Arrays;
//pick the element from unsorted part and place it in a right position

public class Insertion_sort 
{	
	public static void insort(int[] arr) 
	{
        for (int i = 1; i <arr.length ; i++) 
        {
        	int cur =arr[i];
        	int prev=i-1;
        	while(prev>=0 && arr[prev]>cur) 
        	{
        		arr[prev+1]=arr[prev];
        		prev--;
        	}
        	arr[prev+1]=cur;
      	}
	}
//--------------------------------------------------------------------
	public static void main(String[] args) 
    {
        int[]arr = {29, 10, 14, 37, 13};
        insort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
 