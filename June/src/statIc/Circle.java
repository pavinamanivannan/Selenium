package statIc;

class Cir
{
	static void area()
	{
		double pi=3.142;
		int r=8;
		double z=pi*r*r;
		System.out.println(z);
	}
}
class Circle
{
	public static void main(String[]args)
	{
		Cir.area();
	}
}