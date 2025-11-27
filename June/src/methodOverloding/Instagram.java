package methodOverloding;

class Instagram
{
	static void upload(String a)
	{
		System.out.println(a);
	}
	static void upload(int o)
	{
		System.out.println(o);
	}
	static void upload(String s, int a)
	{
		System.out.println(s+" "+a);
	}
	static void upload(int a, String s)
	{
		System.out.println(a+" "+s);
	}
	public static void main(String[]args)
	{
		upload(108);
		upload("Story "+1);
		upload(777+" Post");
		upload("Story");
	}
}