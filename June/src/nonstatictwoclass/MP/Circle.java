package nonstatictwoclass.MP;

class Cir
{
	void area(int r)
	{
		double pi=3.142;
		System.out.println(pi*r*r);
	}
}
class Circle
{
	public static void main(String[]args)
	{
		new Cir().area(5);
	}
}