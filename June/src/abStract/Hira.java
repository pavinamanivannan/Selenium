package abStract;

abstract class Demo
{
	abstract void access();
	abstract void print();
}
class Sample extends Demo
{
	void access()
	{
		System.out.println("Access the Sample");
	}
	void print()
	{
		System.out.println("Print the Sample");
	}
}
class Tester extends Demo
{
	void access()
	{
		System.out.println("Access the tester");
	}
	void print()
	{
		System.out.println("Print the tester");
	}
}
class Hira
{
	public static void main(String[]args)
	{
		Tester t = new Tester();
		t.access();
		t.print();
		Sample s = new Sample();
		s.access();
		s.print();
	}
}