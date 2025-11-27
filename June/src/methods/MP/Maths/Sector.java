package methods.MP.Maths;

class Sector
{
	static void sec(int r, int t)
	{
		double area=0.5*r*r*t;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		sec(5,6);
		sec(7,3);
		sec(4,9);
	}
}