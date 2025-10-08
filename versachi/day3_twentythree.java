package versachi;

public class day3_twentythree 
{
	public static void main(String[] args) 
	{
		int[][]mat= {{1,2,3,5},
				     {4,9,6,1},
				     {7,8,9,1},
				     {5,6,7,8}};
		int sum=0;
		for (int i=0;i<mat.length;i++) 
		{
			sum+=mat[i][i];	
		}
		System.out.println("sum of the diagonal elements is "+sum);
	}
}