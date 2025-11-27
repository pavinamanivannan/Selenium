package nonStatic;

class Addition
{
	void add()
	{
		int a = 10;
		int b = 50;
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		new Addition().add();
	}
}