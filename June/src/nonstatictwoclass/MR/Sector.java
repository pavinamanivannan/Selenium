package nonstatictwoclass.MR;

class Sec
{
	double area()
	{
		int r=8;
		int t=3;
		double res =0.5*r*r*t;
		
		return res;
	}
}
class Sector
{
	public static void main (String[]args)
	{
	double a = new Sec().area();
	System.out.println(a);
	}
}