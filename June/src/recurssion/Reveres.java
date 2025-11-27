package recurssion;

class Reveres
{
	static void disp(int n)
	{
		if (n>=1)
		{
			System.out.println(n);
			n--;
			disp(n);
		}
	}
	public static void main(String[]args)
	{
		disp(5);
	}
}