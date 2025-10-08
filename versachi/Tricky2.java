package versachi;

public class Tricky2 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,2,3,4,1,2,3};
		boolean[]vstd=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			if(vstd[i])  continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					vstd[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" occurs " +count+ " times");
		}
	}
}