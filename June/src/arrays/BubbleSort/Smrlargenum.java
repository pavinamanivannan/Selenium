package arrays.BubbleSort;

class Smrlargenum
{
	static int num()
	{
		int[] ar={54,8,31,92,37,50};
		int large=Integer.MIN_VALUE;;
		for (int i=0;i<ar.length;i++ )
		{
			if (ar[i]>large)
			{
				large = ar[i];
			}
		}
		return large;
	}
	public static void main (String[]args)
	{
		int a =num();
		System.out.println(a);
	}
}