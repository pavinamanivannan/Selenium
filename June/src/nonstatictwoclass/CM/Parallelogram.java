package nonstatictwoclass.CM;

class Para
{
	void area()
	{
		int b= 3;
		int h= 6;
		int res = b*h;
		System.out.println(res);
	}
}
class Parallelogram
{
	public static void main(String[]args)
	{
	new Para().area();
	}
}