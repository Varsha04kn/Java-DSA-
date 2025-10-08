package versachi;

public class Tricky3 
{
	public static void main(String[] args) 
	{
		int []arr= {1,2,3,4,5,7};
		int n=7;
		int sum=n*(n+1)/2;
		int arrsum=0;
		for(int num:arr)
		{
			arrsum+=num;
		}
		System.out.println("missing number "+(sum-arrsum));
	}
}
