package statIc;

class Trape
{
	static double area(int a, int b, int h)
	{
		double res = 0.5*(a+b)*h;
		
		return res;
	}
}
class Trapezoid
{
	public static void main(String[]args)
	{
		double res = Trape.area(4,7,2);
		System.out.println(res);
	}
}