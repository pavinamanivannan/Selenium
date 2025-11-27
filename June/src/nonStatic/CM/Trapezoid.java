package nonStatic.CM;

class Trapezoid
{
	void trape()
	{
		int a = 18;
		int b = 5;
		int h = 3;
		double area = 0.5*(a+b)*h;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Trapezoid().trape();
	}
}