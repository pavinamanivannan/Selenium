package statIc;

class Ell
{
	static double area(int a, int b)
	{
		double pi = 3.142;
		double res = pi*a*b;
		
		return res;
	}
}

class Ellipse
{
	public static void main(String[]args)
	{
		double res = Ell.area(5,6);
		System.out.println(res);
	}
}