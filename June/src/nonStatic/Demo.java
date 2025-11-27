package nonStatic;

class Demo
{
	int a =18;
	void disp()
	{
		System.out.println("Hello Java");
	}
		public static void main(String[]args)
	{
		new Demo().disp();
		System.out.println(new Demo().a);
	}
}