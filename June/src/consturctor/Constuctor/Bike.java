package consturctor.Constuctor;

class Bike
{
	int bike_cost;
	String bike_brand;
	String bike_color;
	Bike (int a, String b,String c)
	{
		bike_cost=a;
		bike_brand=b;
		bike_color=c;
	}
	public static void main(String[]args)
	{
		Bike b1=new Bike(70000,"KTM","Black");
		Bike b2=new Bike(90000,"Honda","Black");
		System.out.println(b1.bike_cost+" "+b1.bike_brand+" "+b1.bike_color);
		System.out.println(b2.bike_cost+" "+b2.bike_brand+" "+b2.bike_color);
	}
}