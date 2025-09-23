package versachi;
import java.util.Scanner;
public class fifth 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr the num");
		int num=sc.nextInt();
		int ft=0;
		int st=1;
		int nt=0;
		if(num<=0) 
		{
			System.out.println("ent prop num");
		}
		else if(num==1)
		{
			System.out.println("fib is 0");
		}
		else 
		{
			for(int i=1; i<=num; i++) 
			{
				System.out.println(nt+ " ");
				nt=ft+st;
				ft=st;
				st=nt;
			}
		}
	}
	

}
