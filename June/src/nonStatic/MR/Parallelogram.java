package nonStatic.MR;

class Parallelogram
{
	int para(int b,int h)
	{
	int area = b*h;
	
	return area;
	}
	public static void main(String[]args)
	{
		int res = new Parallelogram().para(3,4);
		System.out.println(res);
	}
}