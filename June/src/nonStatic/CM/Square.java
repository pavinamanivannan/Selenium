package nonStatic.CM;

class Square
{
	void sqa()
	{
		int a =6;
		int area = a*a;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Square().sqa();
	}
}