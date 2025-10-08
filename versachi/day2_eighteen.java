package versachi;
import java.util.Arrays;
import java.util.Scanner;

public class eighteen 
{
	public static void main(String[] args) 
	{
		
		String s1="java is fun ";
		String s2=" ";
		
		String[]words = s1.split(" ");
		for(int i = words.length-1 ;i>=0;i--)
		{
			s2+=words[i]+" ";
		}
		System.out.println(s2);
	}
}

