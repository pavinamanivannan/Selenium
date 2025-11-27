package methods.MR.Shape;

class Sector
{
	static double sec(int r, int t)
	{
		double area=0.5*r*r*t;
		
		return area;
	}
	public static void main (String[]args)
	{
		System.out.println(sec(7,3));
	}
}