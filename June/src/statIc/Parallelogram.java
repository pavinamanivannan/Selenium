package statIc;

class Para
{
	static int area(int b, int h)
	{
		int res = b*h;
		
		return res;
	}

}
class Parallelogram
{
	public static void main(String[]args)
	{
		int res = Para.area(5,6);
		System.out.println(res);
	}
}