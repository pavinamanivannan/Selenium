package methods.MR.Shape;

class Ellipse
{
	static double ell(int a, int b)
	{
		double pi=3.142;
		double area=pi*a*b;
		
		return area;
	}
	public static void main(String[]args)
	{
		System.out.println(ell(6,9));
	}
}