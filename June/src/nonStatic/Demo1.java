package nonStatic;

class Demo1
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		new Demo1().add(45,90);
	}
}
