package abStract.Interface;

abstract interface Demo
{
	static final int a =10;
	public abstract void disp();
	void print();
}
abstract class Sample implements Demo
{
	public void print()
	{
		System.out.println("Hello");
	}
}
class Testing extends Sample
{
	public void disp()
	{
		System.out.println("Byee");
	}
}
class Ainterface
{
	public static void main(String[]args)
	{
		Testing t = new Testing();
		t.print();
		t.disp();
		System.out.println(Demo.a);
	}
}