package versachi;
import java.util.Arrays;

public class Quick_sort 
{
	public static void qsort(int arr[],int si,int ei) 
	{
		if (si>=ei)
			return ;
		int pidx=partition(arr,si,ei);
		
		qsort(arr, si, pidx-1);
		qsort(arr, pidx+1, ei);		
			}

	public static int partition(int arr[],int si, int ei)
	{
		int pivot=arr[ei];
		int i=si-1;
		for(int j=si;j<ei;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[ei];
		arr[ei]=temp;
		return i;
	}
	public static void prinarr(int arr[]) {
		for(int val:arr)
			System.out.print(val+" ");
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		
		int arr[]= {5,7,9,8,4,2,1};
		System.out.println("Original array: " );
		prinarr(arr);
		qsort(arr, 0, arr.length-1);
		System.out.println("Sorted array:   " );
		prinarr(arr);
	}
}
