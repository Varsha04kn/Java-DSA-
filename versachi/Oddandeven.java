package versachi;

public class Oddandeven 
{
public static void main(String[] args) 
	{
		int []arr= {1,2,3,4,5,19,21,20,45,56,15,45};
		int counteven=0;
		int countodd=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				counteven++;
			}
			else
			{
				countodd++;
			}			
		}
		System.out.println("Total even numbers are:"+counteven+"\nTotal odd numbers are:"+countodd);	
	}
}
