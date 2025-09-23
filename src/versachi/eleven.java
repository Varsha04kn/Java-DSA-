package versachi;
import java.util.Scanner;
public class eleven 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		
		System.out.println("Enter the operation");
		char operator=sc.next().charAt(0);
		switch(operator) 
		{
			case '+' :
				System.out.println("sum = "+(a+b));
				break;
			case '-' :
				System.out.println("diff = "+(a-b));
				break;
			case '/' :
				System.out.println("div = "+(a/b));
				break;
			case '*' :
				System.out.println("mul = "+(a*b));
				break;
			case '%' :
				System.out.println("mod = "+(a%b));
				break;
				
		}
	}
}
