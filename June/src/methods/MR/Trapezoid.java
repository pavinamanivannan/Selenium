package methods.MR;

class Trapezoid
{
	static double trape()
	{
		int a = 4;
		int b = 5;
		int h = 7;
		double area = 0.5 *(a+b)*h;
		
		return area;
	}
	public static void main(String[]args)
	{
		double a = trape();
		System.out.println(a);
	}
}