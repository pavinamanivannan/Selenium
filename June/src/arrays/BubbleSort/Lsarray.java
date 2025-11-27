package arrays.BubbleSort;

class Lsarray
{
	public static void main(String[]args)
	{
		int[] ar={15,82,86,1,78};
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar.length-1 ;j++ )
			{
				if (ar[j]>ar[j+1])
				{
					int temp =ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
			System.out.println(ar[0]);
			System.out.println(ar[ar.length-1]);
	}
}