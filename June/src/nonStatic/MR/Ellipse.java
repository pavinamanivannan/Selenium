package nonStatic.MR;

class Ellipse
{
	double ell(int a,int b)
	{
		double pi = 3.142;
		
		double area = pi*a*b;
		
		return area;
	}
	public static void main(String[]args)
	{
		double res = new Ellipse().ell(3,7);
		System.out.println(res);
	}
}