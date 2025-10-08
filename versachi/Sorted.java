package versachi;

public class Sorted 
{
	public static void main(String[] args) 
	{
		int []arr= {1,5,10,5,6};
		boolean sorted = true;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>arr[i+1])
			{
				sorted=false;
				break;
			}
		}
		if(sorted) 
		{
			System.out.println("sorted");
		}
		else 
		{
			System.out.println("Not sorted");
		}
	}
}
