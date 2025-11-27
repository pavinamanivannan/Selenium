package arrays.BubbleSort;

class Bubble
{
	public static void main(String[]args)
	{
		int[] ar={5,3,7,9,4,2,8};
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar.length-1 ;j++ )
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.println(ar[i]);
		}
	}
}