package nonstatictwoclass.CM;

class Rec
{
	void area()
	{
		int w = 8;
		int h = 4;
		int res = w*h;
		System.out.println(res);
	}
}
class Rect
{
	public static void main(String[]args)
	{
		new Rec().area();
	}
}