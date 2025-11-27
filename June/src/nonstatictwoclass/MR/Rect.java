package nonstatictwoclass.MR;

class Rec
{
	int area()
	{
		int w =9;
		int h=8;
		int res=w*h;
		
		return res;
	}
	
}
class Rect
{
	public static void main(String[]args)
	{
		int a = new Rec().area();
		System.out.println(a);
	}
}