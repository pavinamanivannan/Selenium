package methods.MP.Maths;

class Triangle
{
	static void tri(int b, int h)
	{
		double area=0.5*b*h;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		tri(4,5);
		tri(7,8);
	}
}