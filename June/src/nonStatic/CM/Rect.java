package nonStatic.CM;

class Rect
{
	void rec()
	{
		int w = 45;
		int h = 20;
		int area=w*h;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Rect().rec();
	}
}