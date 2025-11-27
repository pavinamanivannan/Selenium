package nonStatic.MR;

class Trapezoid
{
	double trape(int a, int b, int h)
	{
		double area = 0.5*(a+b)*h;
		
		return area;
	}
	public static void main(String[]args)
	{
		double res = new Trapezoid().trape(4,9,2);
		System.out.println(res);
	}
}