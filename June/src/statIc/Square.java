package statIc;

class Sqa
{
	static int area(int a)
	{
		int res = a*a;
		
		return res;
	}
}
class Square
{
	public static void main(String[]args)
	{
		int res = Sqa.area(4);
		System.out.println(res);
	}
}