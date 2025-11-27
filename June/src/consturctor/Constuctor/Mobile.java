package consturctor.Constuctor;

class Mobile
{
	int mobile_cost;
	String mobile_name;
	String mobile_color;
	Mobile(int a,String b,String c)
	{
		mobile_cost=a;
		mobile_name=b;
		mobile_color=c;
	}
	public static void main(String[]args)
	{
		Mobile m1=new Mobile(40000,"VIVO","Blue");
		Mobile m2=new Mobile(30000,"OPPO","Black");
		System.out.println(m1.mobile_cost+" "+m1.mobile_name+" "+m1.mobile_color);
		System.out.println(m2.mobile_cost+" "+m2.mobile_name+" "+m2.mobile_color);
	}
}