package methodOverriding;

class Animal
{
	void sound()
	{
		System.out.println("Some sound");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meow Meow");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Bow Bow");
	}
}
class Cow extends Animal
{
	void sound()
	{
		System.out.println("Ambaa...!");
	}
}
class Animalsound
{
	public static void main(String[]args)
	{
		Cat c=new Cat();
		c.sound();
		Dog d=new Dog();
		d.sound();
		Cow cw=new Cow();
		cw.sound();
	}
}