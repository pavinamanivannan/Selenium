package statIc;

class Rects
{
	static int area(int w, int h)
	{
		int res = w*h;
		
		return res;
	}
	
}

class Rect2
{
	public static void main(String[]args)
	{
		int res = Rect.area(5,7);
		System.out.println(res);
	}
}