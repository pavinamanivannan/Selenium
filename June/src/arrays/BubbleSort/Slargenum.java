package arrays.BubbleSort;

class Slargenum
{
	public static void main(String[]args)
	{
		int[] ar = {51,58,32,84,12,75};
		int large=0;
		for (int i=0;i<ar.length; i++)
		{
			if (ar[i]>large)
			{
				large = ar[i];
			}
		}
		System.out.println(large);
	}
}