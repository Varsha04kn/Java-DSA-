package versachi;
public class Triangle 
{
	public static void hallow_triangle(int n)
	{

		for (int i = 1; i <= n; i++) 
		{           
			for (int j = i; j < n; j++) 
			{ 
				System.out.print(" ");
			}

			for(int k=1;k<=(2*i-1);k++) 
			{
				if (k == 1 || i == n || k == (2*i-1)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" "); 
				}
			}System.out.println("");
		}  
	}
public static void main(String[] args) {
	hallow_triangle(11);
}
}