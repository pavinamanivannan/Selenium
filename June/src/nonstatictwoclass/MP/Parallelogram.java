package nonstatictwoclass.MP;

class Para
{
	void area(int b, int h)
	{
		int res = b*h;
		System.out.println(res);
	}
}
class Parallelogram
{
	public static void main(String[]args)
	{
		new Para().area(4,3);
	}
}