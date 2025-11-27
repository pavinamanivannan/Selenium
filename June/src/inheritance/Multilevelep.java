package inheritance;

class Tree
{
	void disp()
	{
		System.out.println("Hello");
	}
}
class Water extends Tree
{
	void prints()
	{
		System.out.println("HI");
	}
}
class People extends Water
{
	void go()
	{
		System.out.println("Byee");
	}
}
class Multilevelep
{
	public static void main(String[]args)
	{
		People t= new People();
		t.disp();
		t.prints();
		t.go();
	}
}