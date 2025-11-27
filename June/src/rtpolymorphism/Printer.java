package rtpolymorphism;

class Printers
{
	void print()
	{
		System.out.println("Black and white printing");
	}
}
class Colorprint extends Printers
{
	void print()
	{
		System.out.println("Color printing");
	}
}
class Leaserprinter extends Printers
{
	void print()
	{
		System.out.println("Highspeed color printing");
	}
}
class Print_all
{
	static void printing(Printers p)
	{
		p.print();
	}
}
class Printer
{
	public static void main(String[]args)
	{
		Printers a =new Printers();
		Print_all.printing(a);
	}
}
