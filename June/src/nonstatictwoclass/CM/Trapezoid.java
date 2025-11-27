package nonstatictwoclass.CM;

class Trape
{
	void area()
	{
		int a = 2;
		int b = 7;
		int h = 8;
		double res = 0.5*(a+b)*h;
		System.out.println(res);
	}
}
class Trapezoid
{
	public static void main(String[]args)
	{
		new Trape().area();
	}
}