package rtpolymorphism;

class App
{
	void install()
	{
		System.out.println("App is installed");
	}
}
class Whatsapp extends App
{
	void install()
	{
		System.out.println("Whatsapp is installed successfully");
	}
}
class Facebook extends App
{
	void install()
	{
		System.out.println("Facebook is installed successfully");
	}
}
class Playstore
{
	static void download(App s)
	{
		s.install();
	}
}
class UserA
{
	public static void main(String[]args)
	{
		Whatsapp w = new Whatsapp();
		Playstore.download(w);
		Facebook f = new Facebook();
		Playstore.download(f);
	}
}