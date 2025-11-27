package inheritance;


class Color 
{
	void disp()
	{
		System.out.println("Hello");
	}
}
class Green extends Color
{
	void come()
	{
		System.out.println("byee");
	}
}
class SingleI1
{
	public static void main(String[]args)
	{
		Green s = new Green();
		s.come();
		s.disp();
	}
}