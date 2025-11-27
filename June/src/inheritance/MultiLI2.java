package inheritance;

class Chair
{
	void person()
	{
		System.out.println("Person can use");
	}
}
class Board extends Chair
{
	void write()
	{
		System.out.println("Write on the board");
	}
}
class Pen extends Board
{
	void use()
	{
		System.out.println("We will use the pen");
	}
}
class MultiLI2
{
	public static void main(String[]args)
	{
		Pen p = new Pen();
		p.use();
		p.write();
		p.person();
	}
}
