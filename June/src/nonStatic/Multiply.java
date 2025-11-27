package nonStatic;

class Multiply
{
	void mul()
	{
		int a=90;
		int b=6;
		System.out.println(a*b);
	}
	public static void main(String[]args)
	{
		new Multiply().mul();
	}
}