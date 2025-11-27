package nonstatictwoclass.RV;

class Circle
{
	void area()
	{
		int r=5;
		double pi=3.142;
		System.out.println(pi*r*r);
	}
	public static void main(String[]args)
	{
		Circle c= new Circle();
		c.area();
	}
}