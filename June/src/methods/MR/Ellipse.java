package methods.MR;

class Ellipse
{
	static double ell()
	{
		int a=3;
		int b=9;
		double pi = 3.142;
		double area = pi*a*b;
		
		return area;
	}
	public static void main(String[]args)
	{
		System.out.println(ell());
	}
}