package nonStatic.MR;

class Divison
{
	int div(int a,int b)
	{
		int z =a/b;
		
		
		return z;
	}
	public static void main(String[]args)
	{
		int res = new Divison().div(65,5);
		System.out.println(res);
	}
}