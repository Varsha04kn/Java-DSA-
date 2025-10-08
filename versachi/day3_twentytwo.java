package versachi;
import  java.util.Arrays;

public class day3_twentytwo 
{
	public static void main(String[] args) 
	{
		int[]arr= {10,5,20,8,15,16,9};
		int largest= Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		for(int num:arr) 
		{
			if (num>largest)
			{
				secondlargest=largest;
				largest=num;
			}
			else if(num>secondlargest && num!=largest) 
			{
				secondlargest=num;
				
			}
		}
		System.out.println("Second largest="+secondlargest);
	}
}
