package versachi;
import java.util.ArrayList;
import java.util.Arrays;

public class Greed_Technique 
{
	public static void main(String[] args) 
	{
		int[] start= {1,3,0,5,8,5};
		int[] end= {2,4,6,7,9,9};
		int max =0;
		ArrayList<Integer> ans=new ArrayList<>();
		max=1;
		ans.add(0);
		int lastend=end[0];
		
		for(int i=1;i<end.length;i++) 
		{
			if(start[i]>=lastend)
			{
				max++;
				ans.add(i);
				lastend=end[i];
			}	
		}
		System.out.println("max activity = "+max);
		for(int i=0;i<ans.size();i++)
		{
			System.out.println("a"+ans.get(i)+" ");
		}
		System.out.println();
	}
}
//--------------------------------------------------------------------------------------------------------------
	/*public static void main(String[] args) 
	{
		greed(args);
	}
}*/
