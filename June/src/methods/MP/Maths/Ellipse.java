package methods.MP.Maths;

class Ellipse
{
	static void ell(int a, int b)
	{
		final double pi=3.142;
		double area=pi*a*b;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		ell(22,4);
		ell(8,5);
	}
}