package passingreference.Assingment;

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
		Customers.Bookingmovie(t);
	}
}
class Customers
{
	static void Bookingmovie(Theater m)
	{
		m.todaymovie();
	}
}