package loopingstatement.Forloop;

class Evensumrt
{
	static int num()
	{
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[]args)
	{
		int a=num();
		System.out.println(a);
	}
}