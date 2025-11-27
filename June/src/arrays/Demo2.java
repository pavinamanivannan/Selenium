package arrays;

class Demo2
{
	static void disp(int[] ar)
	{
		for (int i=0;i<=ar.length-1 ;i++ )
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[]args)
	{
		int[] dr = {34,65,26,879,24,843};
		disp(dr);
	}
}