package nonstatictwoclass.MP;

class Rec
{
	void area(int w, int h)
	{
		int res = w*h;
		System.out.println(res);
	}
}
class Rect
{
	public static void main(String[]args)
	{
		new Rec().area(5,3);
	}
}