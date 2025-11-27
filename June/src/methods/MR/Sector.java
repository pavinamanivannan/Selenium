package methods.MR;

class Sector
{
	static double sec()
	{
		    int r=3;
			int t=5;
			double area = 0.5*r*r*t;
			
			return area;
	}
	public static void main(String[]args)
	{
		double z = sec();
		System.out.println(z);
	}
}