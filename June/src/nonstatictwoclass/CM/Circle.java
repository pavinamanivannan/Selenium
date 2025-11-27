package nonstatictwoclass.CM;

class Cir
{
	void area()
	{
		int r =9;
		double pi =3.142;
		double res = pi*r*r;
		System.out.println(res);
	}
}
class Circle
{
	public static void main(String[]args)
	{
		new Cir().area();
	}
}