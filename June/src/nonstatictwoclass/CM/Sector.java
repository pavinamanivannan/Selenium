package nonstatictwoclass.CM;

class Sec
{
	void area()
	{
		int r=8;
		int t=3;
		double res = 0.5*r*r*t;
		System.out.println(res);
	}
}
class Sector
{
	public static void main(String[]args)
	{
		new Sec().area();
	}
}