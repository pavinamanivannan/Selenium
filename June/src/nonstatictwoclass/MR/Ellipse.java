package nonstatictwoclass.MR;

class Ell
{
	double area()
	{
		double pi = 3.142;
		int a=8;
		int b=4;
		double res=pi*a*b;
		
		return res;
	}
}
class Ellipse
{
	public static void main(String[]args)
	{
		double p= new Ell().area();
		System.out.println(p);
	}
}