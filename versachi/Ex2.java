package versachi;

public class Ex2 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[]arr= new int[3];
			arr[5]=10;
		}catch(ArithmeticException e)
		{
			System.out.println("arith error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("arr index out of bound");
		}
		catch (Exception e) {
			System.out.println("error");
			
		}
	}
}
