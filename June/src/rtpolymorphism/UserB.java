package rtpolymorphism;

class Banking
{
	void transfer()
	{
		System.out.println("Transaction Successfully");
	}
}
class Recharge extends Banking
{
	void transfer()
	{
		System.out.println("Recharge succesfully");
	}
}
class BookTicket extends Banking
{
	void transfer()
	{
		System.out.println("Booking Sucssfully");
	}
}
class Phonepey
{
	static void pay(Banking b)
	{
		b.transfer();
	}
}
class UserB
{
	public static void main(String[]args)
	{
		Recharge r = new Recharge();
		Phonepey.pay(r);
		BookTicket b = new BookTicket();
		Phonepey.pay(b);
	}
}