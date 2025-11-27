package recurssion;

class Odd
{
	static void disp(int n)
	{
		if (n<=10)
		{
			if (n%2==1)
			{
				System.out.println(n);
			}
			n++;
			disp(n);
		}
	}
	public static void main(String[]args)
	{
		disp(1);
	}
}