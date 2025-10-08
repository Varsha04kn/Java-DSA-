package abst;

class Creditcardpayment extends payment
{
	@Override
	void pay (int amount) 
	{
		System.out.println("Paid "+amount+" Using credit card");
	}
}