package versachi;
import  java.util.Arrays;

public class day3_twentyfour 
{
	public static void main(String[] args) 
	{
		int[][]arr= {{1,4,3},
				     {2,2,3},
				     {7,8,9}};
		
		for(int i=0;i<arr.length;i++) 
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++) 
			{
				sum+=arr[i][j];
			}
			System.out.println("Row->"+(i+1)+" sum="+sum);
		}
	}
}
