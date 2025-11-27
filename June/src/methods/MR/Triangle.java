package methods.MR;

class Triangle
{
	static double tri()
	{
		int b = 5;
		int h = 6;
		double area = 0.5 * b * h;
		
		return area;
	}
	public static void main(String[]args)
	{
		double z = tri();
		System.out.println(z);
	}
}