package nonstatictwoclass.MP;

class Trape
{
	void area(int a, int b, int h)
	{
		double res = 0.5*(a+b)*h;
		System.out.println(res);
	}
}
class Trapezoid
{
	public static void main(String[]args)
	{
		new Trape().area(4,7,4);
	}
}