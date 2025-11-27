package methods.MR.Shape;

class Trapezoid
{
	static double trape(int a, int b, int h)
	{
		double area= 0.5*(a+b)*h;
		
		return area;
	}
	public static void main(String[]args)
	{
		double area = trape(8,3,5);
		System.out.println(area);
	}
}