package methods.MR.Condition;

class Oddeven
{
	static String sample(int a)
	{
		if (a%2==0)
		{
			return "Even number";
		}
		else
		{
			return "Odd number";
		}
	}
	public static void main(String[]args)
	{
		System.out.println(sample(5));
	}
}