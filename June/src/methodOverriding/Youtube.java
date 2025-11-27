package methodOverriding;

class Youtube_v1
{
	void updates()
	{
		System.out.println("Click the video then only play");
	}
}
class Youtube_v2 extends Youtube_v1
{
	void updates()
	{
		System.out.println("Click the video then only play and autoplay without music");
	}
}
class Youtube_v3 extends Youtube_v2
{
	void updates()
	{
		System.out.println("Click the video then only play and autoplay without music and autoplay with music");
	}
}
class Youtube 
{
	public static void main(String[]args)
	{
		Youtube_v3 y=new Youtube_v3();
		y.updates();
	}
}