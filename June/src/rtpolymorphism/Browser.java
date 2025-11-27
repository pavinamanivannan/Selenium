package rtpolymorphism;

class Browser_v1
{
	void web()
	{
		System.out.println("Open the pages");
	}
}
class Browser_v2 extends Browser_v1
{
	void web()
	{
		System.out.println("Open pages and play video");
	}
}
class Browser_v3 extends Browser_v2
{
	void web()
	{
		System.out.println("Pages,videos and voice search");
	}
}
class All_browser
{
	static void Brow(Browser_v1 b)
	{
		b.web();
	}
}
class Browser
{
	public static void main(String[]args)
	{
		Browser_v3 b= new Browser_v3();
		All_browser.Brow(b);
	}
}