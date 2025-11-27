package nonStatic.MR;

class Square
{
	int sqa(int a)
	{
		int area = a*a;
		
		return area;
	}
	public static void main(String[]args)
	{
		int res = new Square().sqa(5);
		System.out.println(res);
	}
}