package nonstatictwoclass.MR;

class Para
{
	int area()
	{
		int b =8;
		int h=9;
		int res=b*h;
		
		return res;
	}
}
class Parallelogram
{
	public static void main(String[]args)
	{
	int d = new Para().area();
	System.out.println(d);
	}
}