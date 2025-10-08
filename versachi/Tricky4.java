package versachi;

public class Tricky4 
{
	public static void main(String[] args) 
	{
		int[]arr= {10,24,25,3,7};
		int small =arr[0];
		for (int i=0;i<arr.length;i++) 
		{
			if(arr[i]<small) 
			{
				small = arr[i];	
			}
		}
		
		System.out.println("smallest element is:"+small);
	}
}
