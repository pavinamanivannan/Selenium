package recurssion;

class Value
{
	static int sum = 0;
	static void sum(int n)
	{
		if (n<=5)
		{
			sum = sum+n;
			n++;
			sum(n);
		}
		else {
			System.out.println(sum);
		}
	}
	public static void main(String[]args)
	{
		sum(1);
	}
}