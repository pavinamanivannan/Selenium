package inheritance;

class Demos
{
	void disp()
	{
		System.out.println("Hello");
	}
}
class Samples extends Demos
{
	void print()
	{
		System.out.println("Hii");
	}
}
class Testers extends Demos
{
	void go()
	{
		System.out.println("Bye");
	}
}
class Model extends Samples
{
	void come()
	{
		System.out.println("Don't come");
	}
}
class Hybird
{
	public static void main(String[]args)
	{
		Testers t = new Testers();
		t.disp();
		t.go();
		Model m =new Model();
		m.disp();
		m.print();
		m.come();
	}
	
}