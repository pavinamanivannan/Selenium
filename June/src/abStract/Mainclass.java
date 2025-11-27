package abStract;

abstract class Home
{
	abstract void apple();
	abstract void mango();
}
abstract class Guest1 extends Home
{
	void apple()
	{
		
		System.out.println("Apple juice");
	}
}
class Guest2 extends Guest1
{
	void mango()
	{
		System.out.println("Mango juice");
	}
}
class Mainclass
{
	public static void main(String []args)
	{
		Guest2 g= new Guest2();
		g.mango();
		g.apple();
	}
}