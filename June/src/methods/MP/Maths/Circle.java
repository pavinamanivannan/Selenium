package methods.MP.Maths;

class Circle
{
	static void cir(int r)
	{
		final double pi=3.142;
		double area=pi*r*r;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		cir(8);
		cir(3);
	}
}