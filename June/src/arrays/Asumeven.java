package arrays;

class Asumeven
{
	public static void main(String[]args)
	{
		int[] ar = {1,43,74,3,8,4,2};
		int sum =0;
		for (int i=0;i<ar.length ;i++ )
		{
			sum = sum+ar[i];
		}
		System.out.println(sum);
	}
}