package abStract.Interface;

interface Animals
{
	void cat();
	void dog();
}
abstract class Animal1 implements Animals
{
	public void cat()
	{
		System.out.println("Meow Meow");
	}
}
class Animal2 extends Animal1
{
	public void dog()
	{
		System.out.println("Bow Bow");
	}
}
class Animal
{
	public static void main(String[]args)
	{
		Animal2 a= new Animal2();
		a.dog();
		a.cat();
	}
}