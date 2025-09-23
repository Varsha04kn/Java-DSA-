package versachi;

public class FOURTEEN 
{
	public static void main(String[] args) 
	{
		int num=123456 ;
		int rev=0;
		int temp=num;
		
		while(temp>0)
		{
			rev=rev*10 + temp%10;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println(num+" is palindrome");
		}
		else
		{
			System.out.println(num+" is not palindrome");
		}
	}
}
