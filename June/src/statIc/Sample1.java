package statIc;

class Demo
{
	static int a = 56;
	static void add()
	{
		System.out.println(10+10);
	}
}

class Sample1
{
	public static void main(String[]args)
	{
		Demo.add();
		System.out.println(Demo.a);
	}
}