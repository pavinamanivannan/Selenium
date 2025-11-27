package passingreference;

class Wipro
{
	void takeJob()
	{
		System.out.println("Offered");
	}
}
class Uncle
{
	public static void main(String[]args)
	{
		Wipro w= new Wipro();
		Boy.needJob(w);
	}
}
class Boy
{
	static void needJob(Wipro x)
	{
		x.takeJob();
	}
}