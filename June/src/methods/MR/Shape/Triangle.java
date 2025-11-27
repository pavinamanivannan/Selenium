package methods.MR.Shape;

class Triangle
{
	static double tri(int b, int h)
	{
		double area=0.5*b*h;
	
		return area;
	}
	public static void main (String[]args)
	{
		System.out.println(tri(8,3));
	}
}