package nonStatic.CM;

class Sector
{
	void sec()
	{
		int r =8;
		int t =9;
		double area = 0.5*r*r*t;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Sector().sec();
	}
}