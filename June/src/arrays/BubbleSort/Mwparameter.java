package arrays.BubbleSort;
	
class Mwparameter
{
	static void value(int[] ar)
	{
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar.length-1 ;j++ )
			{
				if (ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	public static void main(String[]args)
	{
		int[] pass = {66,2,84,1,95,37,68,4,52};
		value(pass);
	}
}