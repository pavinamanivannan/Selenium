package nonStatic.CM;

class Triangle
{
	void tri()
	{
		int b = 18;
		int h = 17;
		double area = 0.5*b*h;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Triangle().tri();
	}
}