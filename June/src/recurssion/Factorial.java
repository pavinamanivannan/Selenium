package recurssion;

class Factorial
{
	static int fact =1;
	static void num(int n)
	{
		if (n<=5)
		{
			fact = fact*n;
			n++;
			num(n);
		}
		else {
			System.out.println(fact);
		}
	}
	public static void main(String[]args)
	{
		num(1);
	}
}