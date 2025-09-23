package versachi;
import java.util.Scanner;
public class tenth 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) 
		{
			System.out.println("a= " +a+  " is greater");
		}
		else if (b>a && b>c)
		{
			System.out.println("b= " +b+ " is the greatest");
		}
		else {System.out.println("c= " +c+ " is greatest");}
	}
}
