package consturctor.Constuctor;

class Tv
{
	int tv_cost;
	String tv_brand;
	String tv_type;
	Tv(int a,String b,String c)
	{
		tv_cost=a;
		tv_brand=b;
		tv_type=c;
	}
	public static void main(String[]args)
	{
		Tv t1=new Tv(50000,"LG","LG200");
		Tv t2=new Tv(50000,"Sony","Sony10");
		System.out.println(t1.tv_cost+" "+t1.tv_brand+" "+t1.tv_type);
		System.out.println(t2.tv_cost+" "+t2.tv_brand+" "+t2.tv_type);
	}
}