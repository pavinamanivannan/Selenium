package typecasting;

class Demo
{
	void disp()
	{
		System.out.println("Super class");
	}
}
class Sample extends Demo
{
	void print()
	{
		System.out.println("Sub class");
	}
}
class Downcasting
{
	public static void main(String[]args)
	{
		Demo d= new Sample();
		Sample s=(Sample)d;
		s.disp();
		s.print();
	}
}