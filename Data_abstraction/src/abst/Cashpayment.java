package abst;

class Cashpayment extends payment
{
	@Override 
	void pay (int amount) 
	{
		System.out.println("Paid in cash "+amount);
	}
}
