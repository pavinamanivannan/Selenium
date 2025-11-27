package nonstatictwoclass;

class Iphone 
{
	void buy()
	{
		System.out.println("No money");
	}
	public static void main (String[]args)
	{
		Iphone i= new Iphone();
		i.buy();
	}
}