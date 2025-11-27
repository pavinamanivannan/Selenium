package passingreference;

class Samsung
{
	void takeMobile()
	{
		System.out.println("Purchased");
	}
}
class Amozon
{
	public static void main(String[]args)
	{
		Samsung s= new Samsung();
		Customer1.needMobile(s);
		Customer2.needMobile(s);
		
	}
}
class Customer1
{
	static void needMobile(Samsung p)
	{
		p.takeMobile();
	}
}
class Customer2
{
	static void needMobile(Samsung p)
	{
		p.takeMobile();
	}
}