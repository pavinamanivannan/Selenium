package nonstatictwoclass;

class Fruit
{
	void apple()
	{
		System.out.println("Apple fruit");
	}
}
class Shop
{
	public static void main(String[]args)
	{
		new Fruit().apple();
	}
}