package rtpolymorphism;

class Animal
{
	void sound()
	{
		System.out.println("some sound");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meow meow..!");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Bow bow");
	}
}
class Allsound
{
	static void all(Animal a)
	{
		a.sound();
	}
}
class Mainclass
{
	public static void main(String[]args)
	{
		Cat c = new Cat();
		Allsound.all(c);
	}
}