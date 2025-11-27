package arrays;

class Aeven
{
	public static void main(String[]args)
	{
		int[] ar ={12,3,7,2,6,8,2,6,9,};
		for (int i=0;i<ar.length ;i++ )
		{
			if (ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}
}