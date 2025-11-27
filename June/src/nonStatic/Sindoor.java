package nonStatic;

class Sindoor
{
	static int a=10;
	void war()
	{
		System.out.println("Hello Java");
	}
		public static void main(String[]args)
	{
		new Sindoor().war();
		System.out.println(a);
	}
}