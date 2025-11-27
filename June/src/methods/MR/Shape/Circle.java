package methods.MR.Shape;

class Circle
{
	static double cir(int r)
	{
		double pi=3.142;
		double area = pi*r*r;
		return area;
	}
	
	public static void main(String[]args)
	{
		double a = cir(6);
		System.out.println(a);
	}
}