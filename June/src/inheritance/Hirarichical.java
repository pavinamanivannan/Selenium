package inheritance;

class Demo
{
	void disp()
	{
		System.out.println("HEllo");
	}
}
class Sample extends Demo
{
	void print()
	{
		System.out.println("Hii");
	}
}
class Tester extends Demo
{
	void go()
	{
		System.out.println("Byee");
	}
}
class Hirarichical
{
	public static void main(String[]args)
	{
		Tester t = new Tester();
		t.go();
		t.disp();
		Sample s = new Sample();
		s.disp();
		s.print();
	}
}