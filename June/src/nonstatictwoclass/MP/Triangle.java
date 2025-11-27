package nonstatictwoclass.MP;

class Tri
{
	void area(int b , int h)
	{
		double res = 0.5*b*h;
		System.out.println(res);
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		new Tri().area(6,4);

	}
}