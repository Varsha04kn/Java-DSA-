package abst;

class UPI extends payment
{
	@Override
	void pay (int amount) 
	{
		System.out.println("Paid using upi "+amount);
	}
}