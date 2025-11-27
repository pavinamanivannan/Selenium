package nonStatic.MR;

class Triangle
{
	double tri(int a, int b)
	{
		double area = a*b;
		
		return area;
	}
	public static void main(String[]agrs)
	{
		double res = new Triangle().tri(4,8);
		System.out.println(res);
	}
}