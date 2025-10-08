package properties_of_OOPS;

class Calculator
{
	int add (int a,int b) 
	{
		return a+b;
	}
	
	int add (int a,int b,int c) 
	{
		return a+b+c;
	}
	
	double add (double a,double b) 
	{
		return a+b;
	}
}
public class Methodoverloading
{
	public static void main(String[] args) 
	{
		Calculator calc=new Calculator();
		System.out.println("sum of two integer="+calc.add(5, 10));
		System.out.println("sum of three integer="+calc.add(5, 10, 20));
		System.out.println("sum of two double="+calc.add(143, 341));
	}
}