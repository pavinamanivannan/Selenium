package arrays.BubbleSort;

class Mwreturntype
{
	static int[] sorting(int[] ar)
	{
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar.length-1 ;j++ )
			{
				if (ar[j]>ar[j+1])
				{
					int temp= ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
	}
	public static void main (String[]args)
	{
		int[] ar ={51,12,85,37,93};
		int[] ar2 =sorting(ar);
		for (int i=0;i<ar2.length ;i++ )
		{
			System.out.println(ar2[i]);
		}
	}
}
