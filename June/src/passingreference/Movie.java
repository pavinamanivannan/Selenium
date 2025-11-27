package passingreference;

class Theater
{
	void todaymovie()
	{
		System.out.println("Sachin");
	}
}

class Movie
{
	public static void main(String[]args)
	{
		Theater t=new Theater();
		Customer.Bookingmovie(t);
	}
}
class Customer
{
	static void Bookingmovie(Theater m)
	{
		m.todaymovie();
	}
}