package nonstatictwoclass.CM;

class Tri
{
	void area()
	{
		int b = 13;
		int h = 5;
		double res = 0.5*b*h;
		System.out.println(res);
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		new Tri().area();
	}
}