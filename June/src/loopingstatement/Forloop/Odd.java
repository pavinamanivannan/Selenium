package loopingstatement.Forloop;

class Odd
{
	static int sum()
	{
		int sum =0;
		for (int i=1;i<=10 ;i++)
		{
			if (i%2==1)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main (String[]args)
	{
		int a =sum();
		System.out.println(a);
	}
}