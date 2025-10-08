package versachi;

public class Largest 
{
	public static int getLar(int[]arr)
	{
		int lar=Integer.MIN_VALUE;
		int sm=Integer.MAX_VALUE;
		
		for (int i=0;i<arr.length;i++)
		{
			if(lar<arr[i])
			{
				lar=arr[i];
			}	
			if(sm>arr[i])
			{
				sm=arr[i];
			}
		}
		System.out.println("The smallest value is "+sm);
		return lar;
	}
	
	public static void main(String[] args) 
	{
		int []arr= {1333,4,7,85,2,333};
		int lar=getLar(arr);
		
		System.out.println("The largest element is "+lar);
	}
}
