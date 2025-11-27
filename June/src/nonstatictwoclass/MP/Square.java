package nonstatictwoclass.MP;

class Sqa
{
	void area(int a)
	{
		int res = a*a;
		System.out.println(res);
	}
}
class Square
{
	public static void main(String[]args)
	{
		new Sqa().area(4);
	}
}