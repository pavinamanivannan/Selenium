package passingreference.Assingment;

class Food
{
	void orderfood()
	{
		System.out.println("Ambur Briyani");
	}
}
class Zomato
{
	public static void main(String[]args)
	{
		Food f = new Food();
		User.placeorder(f);
	}
}
class User
{
	static void placeorder(Food a)
	{
		a.orderfood();
	}
}