package nonstatictwoclass.MR;

class Sqa
{
	int area()
	{
		int a=9;
		int res=a*a;
		
		return res;
	}
}
class Square
{
	public static void main(String[]args)
	{
		int a = new Sqa().area();
		System.out.println(a);
	}
}