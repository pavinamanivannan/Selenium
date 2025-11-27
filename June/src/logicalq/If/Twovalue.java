package logicalq.If;

class Twovalue
{
	public int sumDouble(int a,int b)
	{
		if (a==b)
		{
			return (a+b)*2;
		}
		else{
			return a+b;
		}
	}
	public static void main(String[]args)
	{
		Twovalue m = new Twovalue();
		int res = m.sumDouble(3,3);
		System.out.println(res);
	}
	
}