package typecasting;

class Tree
{
	void disp()
	{
		System.out.println("Super class");
	}
}
class Water extends Tree
{
	void Sample()
	{
		System.out.println("Sub class");
	}
}

class Upcasting
{
	public static void main(String[]args)
	{
		Tree d = new Water();
		d.disp();
	}
}