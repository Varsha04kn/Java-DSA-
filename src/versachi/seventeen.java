package versachi;
import java.util.Arrays;
import java.util.Scanner;

public class seventeen 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two strings");
		String s1=sc.next();
		String s2=sc.next();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		else 
		{
			char[]arr1= s1.toCharArray();
			char[]arr2= s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2))
			{
				System.out.println("Its Anagram");
			}
		}
		
	}
}
