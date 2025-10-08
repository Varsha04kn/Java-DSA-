package versachi;

public class Ex //exceptions
{
	public static void main(String[] args) 
	{
		try 
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println("Ths line won't run"+c);
		}catch(ArithmeticException e)
		{
			System.out.println("Error");
		}
		System.out.println("Program continue");
	}
}
