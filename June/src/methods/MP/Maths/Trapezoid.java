package methods.MP.Maths;

class Trapezoid
{
	static void trape(int a, int b, int h)
	{
		double area=0.5*(a+b)*h;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		trape(3,6,8);
		trape(6,8,2);
	}
}