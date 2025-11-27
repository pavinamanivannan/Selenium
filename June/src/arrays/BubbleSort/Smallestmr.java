package arrays.BubbleSort;

class Smallestmr
{
	static int sma()
	{
		int[] ar={45,39,75,61,29,84};
		int small=Integer.MAX_VALUE;
		for (int i=0;i<ar.length ;i++ )
		{
			if (ar[i]<small)
			{
				small=ar[i];
			}
		}
		return small;
	}
	public static void main(String[]args)
	{
		int a=sma();
		System.out.println(a);
	}
}