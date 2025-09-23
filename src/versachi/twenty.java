package versachi;

import java.util.Arrays;

public class twenty 
{
	public static void main(String[] args) 
	{
		int []arr1= {1,2,3};
		int start=0;
		int end= arr1.length-1;
		
		while (start < end)
		{
			int temp=arr1[end];
			arr1[end]=arr1[start];
			arr1[start]=temp;
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}
