package locgicalprgm.Primeno;

class Primeno
{
	static String prime()
	{
		int n =5;
		int count =0;
		for (int i=1;i<=5 ;i++ )
		{
			if (n%i==0)
			{
				count++;
			}
		}
		if (count == 2)
		{
			return "Prime no";
		}
		else 
		{
			return "Not prime no";
		}
	}
}
class Mwrtype
{
	public static void main(String[]args)
	{
		String a = Primeno.prime();
		System.out.println(a);
	}
}