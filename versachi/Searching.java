package versachi;

public class Searching 
{
	public static int Searching(int[] arr, int key) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i]) 
			{
				return i;
			}
		}
		return-1;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {1,4,7,8,5,2,3,6,9};
		int key=8;
		int index=Searching(arr, key);
		if(index==-1) 
		{
			System.out.println("Element not found");
		}
		else {System.out.println("Element found at "+index);}
		
	}
}
