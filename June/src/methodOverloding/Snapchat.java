package methodOverloding;

class Snapchat
{
	static void filter(int a)
	{
		System.out.println(a);
	}
	static void filter(String s, int a)
	{
		System.out.println(s+" "+a);
	}
	static void filter(String s)
	{
		System.out.println(s);
	}
	static void filter(int a, String b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[]args)
	{
		filter(1);
		filter("Black and white "+01);
		filter("Dog filter");
		filter(10+"Blur");
	}
}