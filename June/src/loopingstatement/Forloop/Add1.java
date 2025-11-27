package loopingstatement.Forloop;

class Add1
{
	static void num()
	{
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum =sum+i;
		}
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		num();
	}
}