package nonstatictwoclass.MP;

class Ell
{
	void area(int a,int b)
	{
		double pi= 3.142;
		double res= pi*a*b;
		System.out.println(res);
	}
}
class Ellipse
{
	public static void main(String[]args)
	{
		new Ell().area(5,3);
	}
}