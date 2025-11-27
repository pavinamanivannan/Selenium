package passingreference;

class Rweather
{
	int a=99;
	static void disp(Rweather x)
	{
		System.out.println(x.a);
	}
	public static void main(String[]args)
	{
		Rweather m = new Rweather();
		System.out.println(m.a);
		disp(m);
	}
}