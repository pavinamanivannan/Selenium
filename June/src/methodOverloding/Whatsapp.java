package methodOverloding;

class Whatsapp
{
	static void send(int a)
	{
		System.out.println(a);
	}
	static void send(String s)
	{
		System.out.println(s);
	}
	static void send(String s, int b)
	{
		System.out.println(s+" "+b);
	}
	static void send (int a , String r)
	{
		System.out.println(a+" "+r);
	}
	public static void main(String[]args)
	{
		send(10);
		send("Photo"+10);
		send ("Video");
		send(10 + "Image");
	}
}