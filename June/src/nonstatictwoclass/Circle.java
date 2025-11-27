package nonstatictwoclass;

class Cir
{
	void area()
	{
		double pi=3.142;
		int r=5;
		System.out.println(pi*r*r);
	}
}
class Circle
{
	public static void main(String[]args)
	{
		new Cir().area();
	}
}