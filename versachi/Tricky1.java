package versachi;

public class Tricky1 
{
	Tricky1(int a, int b)
	{
		System.out.println("a="+a+"\nb="+b);
	}
	Tricky1(int a,float b) 
	{
		System.out.println("a="+a+"\nb="+b);
	}
	
	
	public static void main(String[] args) 
	{
		int a=5;
		int b=10;
		Tricky1 test=new Tricky1(a, b);
		
	}
}

