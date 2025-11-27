package methodOverriding;

class Whatsapp_v1
{
	void updates()
	{
		System.out.println("Images");
	}
}
class Whatsapp_v2 extends Whatsapp_v1
{
	void updates()
	{
		System.out.println("Image and video");
	}
}
class Whatsapp_v3 extends Whatsapp_v2
{
	void updates()
	{
		System.out.println("Image with music and video");
	}
}
class Whatsapp
{
	public static void main(String[]args)
	{
		Whatsapp_v3 w = new Whatsapp_v3();
		w.updates();
	}
}