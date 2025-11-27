package nonStatic.CM;

class Circle
{
	void cir()
	{
		int r =7;
		double pi = 3.142;
		double area =pi*r*r;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Circle().cir();
	}
}