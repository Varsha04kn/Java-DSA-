package abst;

public class Main 
{
	public static void main(String[] args) 
	{
		payment p1=new Creditcardpayment();
		payment p2=new UPI();
		payment p3=new Cashpayment();
		
		p1.showpaymentgateway();
		p1.pay(500);
		
		p2.showpaymentgateway(); 
		p2.pay(1000);

		p3.showpaymentgateway();
		p3.pay(1500);
	}
}
