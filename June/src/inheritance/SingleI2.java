package inheritance;

class Banana
{
	void food()
	{
		System.out.println("Its monkey fav fruit");
	}
}
class Monkey extends Banana
{
	void eat()
	{
		System.out.println("Monkey eaten a Banana");
	}
}
class SingleI2
{
	public static void main(String[]args)
	{
		Monkey m = new Monkey();
		m.eat();
		m.food();
	}
}