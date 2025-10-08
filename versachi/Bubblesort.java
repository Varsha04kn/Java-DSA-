package versachi;

public class Bubblesort 
{
	public static void main(String[] args) 
	{
		int []arr= {0,1,5,8,6,7,1,3,6};
		Bubblesort(arr);
	}
	
//------------------------------------------------------------------------------	

	public static void Bubblesort(int []arr)
	{
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-1-i;j++) 
			{
				
				if(arr[j+1]>arr[j]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}				
			}
			
		}
		System.out.println("sorted elements are: ");
		for (int element : arr) 
		{
            System.out.print(element+ ", ");
		}
	}
}
