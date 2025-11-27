package loopingstatement.Forloop.Patterns;

class Charcter
{
	public static void main(String[]args)
	{
		char count='A';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}