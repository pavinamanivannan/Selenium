package locgicalprgm.Primeno;

class Demo
{
	static void prime(int n)
	{
		int count = 0;
		for (int i = 1; i<=5;i++ )
		{
			if (n%i==0)
			{
				count++;
			}
		}
		if (count == 2)
		{
			System.out.println("Prime No");
		}
		else 
		{
			System.out.println("Not Prime no");
		}
	}
	
}
class Mwpara       
{
	public static void main(String[]args)
	{
		Demo.prime(3);
	}
}