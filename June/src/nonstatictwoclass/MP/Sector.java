package nonstatictwoclass.MP;

class Sec
{
	void area(int r,int t)
	{
		double res = 0.5*r*r*t;
		System.out.println(res);
	}
}
class Sector
{
	public static void main(String[]args)
	{
		new Sec().area(4,2);
	}
}