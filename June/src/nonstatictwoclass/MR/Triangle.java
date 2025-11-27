package nonstatictwoclass.MR;

class Tri
{
	double area()
	{
		int b=9;
		int h=3;
		double res =0.5*b*h;
		
		return res;
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		double a = new Tri().area();
		System.out.println(a);
	}
}