package nonstatictwoclass.CM;

class Ell
{
	void area()
	{
		double pi = 3.142;
		int a = 2;
		int b = 3;
		double res = pi*a*b;
		System.out.println(res);
	}
}
class Ellipse
{
	public static void main(String[]args)
	{
		new Ell().area();
	}
}