package nonstatictwoclass.MR;

class Trape
{
	double area()
	{
		int a=5;
		int b=4;
		int h=9;
		double res = 0.5*(a+b)*h;
		
		return res;
	}
}
class Trapezoid
{
	public static void main(String[]args)
	{
		double a = new Trape().area();
		System.out.println(a);
	}
}