package nonStatic.MR;

class Sector
{
	double sec(int r,int t)
	{
		double area =0.5*r*r*t;
		
		return area;
	}
	public static void main(String[]args)
	{
		double res = new Sector().sec(5,7);
		System.out.println(res);
	}
}