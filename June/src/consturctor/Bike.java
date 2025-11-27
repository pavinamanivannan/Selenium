package consturctor;

class Bike 
{
	double b_cost;
	String b_brand;
	String b_color;
	Bike(double b_cost,String b_brand,String b_color)
	{
		this.b_cost=b_cost;
		this.b_brand=b_brand;
		this.b_color=b_color;
	}
	public static void main(String[] args) 
	{
		Bike b1 = new Bike(120000,"KTM","Orange");
		Bike b2 = new Bike(93000,"TVS","Red");
		System.out.println(b1.b_cost+" "+b1.b_brand+" "+b1.b_color);
		System.out.println(b2.b_cost+" "+b2.b_brand+" "+b2.b_color);
	}
}
