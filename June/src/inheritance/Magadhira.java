package inheritance;

class Bhairava
{
	void hourseride()
	{
		
		System.out.println("Tuku tuku");
	}
}
class Harsha extends Bhairava
{
	void bikeride()
	{
		System.out.println("boom boom");
	}
}
class Magadhira
{
	public static void main(String[]args)
	{
		Harsha h= new Harsha();
		h.hourseride();
		h.bikeride();
	}
}