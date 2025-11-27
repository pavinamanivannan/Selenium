package arrays.BubbleSort;

class Smallest
{
	public static void main(String[]args)
	{
		int [] ar= {51,82,34,91,67,54};
		int small = Integer.MAX_VALUE;
		for (int i=0;i<ar.length;i++)
		{
			if (ar[i]<small)
			{
				small=ar[i];
			}
		}
		System.out.println(small);
	}
}