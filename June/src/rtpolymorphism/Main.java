package rtpolymorphism;

class Plane
{
	void fly()
	{
		System.out.println("Plane ud flying");
	}
}
class Cargoplane extends Plane
{
	void fly()
	{
		System.out.println("Caryoplane is flying ar speed 16kmph");
	}
}
class Fighterjet extends Plane
{
	void fly()
	{
		System.out.println("Fighter is flying ar 500kmph");
	}
}
class Kingfisher
{
	static void takeoff(Plane p)
	{
		p.fly();
	}
}
class Main
{
	public static void main(String[]args)
	{
	  Cargoplane c = new Cargoplane();
	  Kingfisher.takeoff(c);
	  Fighterjet f = new Fighterjet();
	  Kingfisher.takeoff(f);
	}
}