package versachi;
import java.util.Scanner;
public class sixteen {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long num=sc.nextLong();
		long count=0;
		
		if(num>0) 
		{
			while(num>0)
			{
				num=num/10;
				count++;
			}
		System.out.println(count);
		}
		else
		{
			System.out.println("Enter positive ");
		}
	}
}
