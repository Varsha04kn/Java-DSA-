package versachi;

public class recursion 
{
	public static void printd(int n) 
	{
		if(n==1)
		{
			System.out.print(n);
			return ;
		}
		System.out.print(n+" ");
		printd(n-1);
	}
	public static void main(String[] args) 
	{
		int n=10;
		printd(n);
	}
}