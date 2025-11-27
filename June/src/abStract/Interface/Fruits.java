package abStract.Interface;

interface Home
{
	void mango();
	void apple();
}
class Guest1 implements Home
{
	public void mango()
	{
		System.out.println("Mango juice");
	}
	public void apple()
	{
		System.out.println("Apple juice");
	}
}
class Guest2 implements Home
{
	public void mango()
	{
		System.out.println("Mango juice");
	}
	public void apple()
	{
		System.out.println("Apple juice");
	}
}

class Fruits 
{
	public static void main(String[]args)
	{
		Guest2 f2 = new Guest2();
		f2.mango();
		f2.apple();
		Guest1 f1 = new Guest1();
		f1.mango();
		f1.apple();
		
	}
}