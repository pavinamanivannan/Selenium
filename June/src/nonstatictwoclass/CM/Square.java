package nonstatictwoclass.CM;

class Sqa
{
	void area()
	{
		int a = 5;
		int res = a*a;
		System.out.println(res);
	}
}
class Square
{
	public static void main(String[]args)
	{
		new Sqa().area();
	}
}