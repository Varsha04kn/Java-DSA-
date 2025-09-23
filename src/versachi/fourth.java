package versachi;
import java.util.Scanner;
public class fourth 
{
	public static void main(String[] args) 
	{
		Scanner x= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=x.nextInt();
		int rev=0;

		while (num != 0)
		{
			rev= rev*10 + num%10 ;
			num=num/10;
		}
		System.out.println("The revereed number is"+rev);
	}
}