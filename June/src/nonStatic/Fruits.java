package nonStatic;

class Fruit
{
	void apple()
	{
		System.out.println("Apple fruir");
	}
}
class Shop
{
	public static void main(String[]args)
	{
		new Fruit().apple();
	}
}