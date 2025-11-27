package passingreference.Assingment;

class Match
{
	void ipl()
	{
		System.out.println("CSK VS RCB");
	}
}
class Jiohotstar
{
	public static void main(String[]args)
	{
		Match m=new Match();
		Customer.watchipl(m);
	}
}
class Customer
{
	static void watchipl(Match i)
	{
		i.ipl();
	}
}