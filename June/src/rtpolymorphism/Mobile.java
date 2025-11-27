package rtpolymorphism;

class Phone
{
	void feature()
	{
		System.out.println("Call and SMS");
	}
}
class Smartphone extends Phone
{
	void feature()
	{
		System.out.println("Call ,SMS,Internet");
	}
}
class SmartMobile extends Phone
{
	void feature()
	{
		System.out.println("High camera");
	}
}
class Mobile_all
{
	static void model(Phone s)
	{
		s.feature();
	}
}
class Mobile
{
	public static void main(String[]args)
	{
		Smartphone m = new Smartphone();
		Mobile_all.model(m);
	}
}