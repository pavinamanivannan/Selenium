package nonstatictwoclass.MP;

class Multiply
{
	void mul(int a ,int b)
	{
		System.out.println(a*b);
	}
}
class Multiplication
{
	public static void main(String[]args)
	{
		new Multiply().mul(8,5);
	}
}