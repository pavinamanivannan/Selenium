package nonStatic.CM;

class Ellipse
{
	void ell()
	{
		int a = 12;
		int b = 5;
		double pi =3.142;
		double area = pi*a*b;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Ellipse().ell();
	}
}