package statIc;

class Tri
{
	static double area(int b, int h)
	{
		double res = 0.5*b*h;
		
		return res;
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		double res = Tri.area(4,5);
		System.out.println(res);
	}
}