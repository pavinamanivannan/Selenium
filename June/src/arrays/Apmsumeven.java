package arrays;

class Apmsumeven
{
	static void num(int[] ar)
	{
		int sum=0;
		for (int i=0;i<ar.length ;i++ )
		{
			if(i%2==0)
			{
				sum = sum+ar[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		int[] ar={1,4,6,5,8,2,9,0};
		num(ar);
	}
}