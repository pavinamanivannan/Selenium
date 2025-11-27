package inheritance;

class Father
{
	void site()
	{
		System.out.println("Take it");
	}
}

class Son extends Father
{
	void home()
	{
	System.out.println("Own house");
	}
}
class Mainclass 
{
	public static void main(String[]args)
	{
		Son s = new Son();
		s.home();
		s.site();
	}
}