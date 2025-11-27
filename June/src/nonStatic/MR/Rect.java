package nonStatic.MR;

class Rect
{
	int rec(int w, int h)
	{
		int area = w*h;
		
		return area;
	}
	public static void main(String[]args)
	{
		int res = new Rect().rec(3,5);
		System.out.println(res);
	}
}