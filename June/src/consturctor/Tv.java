package consturctor;

class Tv 
{
	int tv_cost;
	String tv_brand;
	String tv_type;
	Tv(int tv_cost,String tv_brand,String tv_type)
	{
	this.tv_cost=tv_cost;
	this.tv_brand=tv_brand;
	this.tv_type=tv_type;
	}
	public static void main(String[] args) 
	{
		Tv t1 = new Tv(35000,"Samsung","LED");
		Tv t2 = new Tv(40000,"LG","OLED");
		System.out.println(t1.tv_cost+" "+t1.tv_brand+" "+t1.tv_type);
		System.out.println(t2.tv_cost+" "+t2.tv_brand+" "+t2.tv_type);
	}
}
