package versachi;
import java.util.Scanner;
public class twelve 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number F");
		int n=sc.nextInt();
		int F=1;
		for(int i=1;i<=n;i++) 
			F=F*i;
		{
				
			System.out.print(F);
		}
	}
}
