package abst;

abstract class payment 
{
	abstract void pay (int amount);
	void showpaymentgateway()
	{
		System.out.println("Using secure payment gateway");
	}
}
