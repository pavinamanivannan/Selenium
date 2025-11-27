package statIc;

class Result
{
	static double area(int r)
	{
		double pi=3.142;
		double res=pi*r*r;
		
		return res;
	}
}

class Circlemr
{
	public static void main(String[]args)
	{
		double res = Result.area(3);
		System.out.println(res);
	}
}