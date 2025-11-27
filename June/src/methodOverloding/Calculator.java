package methodOverloding;

class Calculator
{
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add(int x, double y)
	{
		System.out.println(x-y);
	}
	static void add(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
	static void add (int x, double y,int z)
	{
		System.out.println(x+y-z);
	}
	public static void main(String[]args)
	{
		add(10,2);
		add(90,55.9);
		add(8,3,5);
		add(50,9.8,40);
	}
}