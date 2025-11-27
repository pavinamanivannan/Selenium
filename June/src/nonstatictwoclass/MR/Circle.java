package nonstatictwoclass.MR;

class Cir
{
	double area()
	{
		double pi = 3.142;
		int r =8;
		double res = pi*r*r;
		
		return res;
	}
}
class Circle
{
	public static void main(String[]args)
	{
		double a = new Cir().area();
		System.out.println(a);
	}
}