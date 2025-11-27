package inheritance;

class Demo1
{
	void disp()
	{
		System.out.println("Come");
	}
}
class Demo2 extends Demo1
{
	void diagram()
	{
		System.out.println("Draw");
	}
}
class Demo3 extends Demo2
{
	void ok()
	{
		System.out.println("Finish");
	}
}
class MultiLI1
{
	public static void main(String[]args)
	{
		Demo3 d = new Demo3();
		d.ok();
		d.diagram();
		d.disp();
	}
}