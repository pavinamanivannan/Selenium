package statIc;

class Sec
{
	static double area(int r, int t)
	{
		double res = 0.5*r*r*t;
		
		return res;
	}
}
class Sector
{
	public static void main(String[]args)
	{
		double res = Sec.area(6,3);
		System.out.println(res);
	}
}