package methods.MP;

class Circles
{
	static void cls(int r)
	{
		final double pi= 3.142;
		double res=pi*r*r;
		System.out.println(res);
	}
	public static void main(String[]args)
	{
		cls(3);
		cls(7);
		cls(5);
	}
}