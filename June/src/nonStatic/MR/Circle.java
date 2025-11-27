package nonStatic.MR;

class Circle
{
	double cir(int r)
	{
		double pi=3.142;
		double area = pi*r*r;
		
		return area;
	}
	public static void main(String[]args)
	{
		System.out.println(new Circle().cir(4));
		double res = new Circle().cir(4);
		System.out.println(res);
	}
	
}