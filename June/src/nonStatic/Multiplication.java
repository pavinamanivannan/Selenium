package nonStatic;

class Multiplication
{
	void mul()
	{
		int a =9;
		int b= 6;
		System.out.println(a*b);
	}
	public static void main(String[]args)
	{
		new Multiplication().mul();
	}
}