package recurssion;

class Jarvis
{
	static void disp(int n)
	{
		if (n<=5)
		{
			System.out.println(n);
			n++;
			disp(n);
		}
	}
	public static void main(String[]args)
	{
		disp(1);
	}
}