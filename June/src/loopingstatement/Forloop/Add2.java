package loopingstatement.Forloop;

class Add2
{
	static int num()
	{
		int sum=1;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
		}
		return sum;
	} 
	public static void main(String[]args)
	{
		System.out.println(num());
	}
}