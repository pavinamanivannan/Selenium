package loopingstatement.Forloop;

class Factorial 
{
	static int fact()
	{
		int fact=1;
		int n=5;
		for (int i=n;i>=1;i--)
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int a= fact();
		System.out.println(a);
	}
}
