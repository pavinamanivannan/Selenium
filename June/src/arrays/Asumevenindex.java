package arrays;

class Asumevenindex
{
	public static void main(String[]args)
	{
		int[] ar ={2,5,7,1,8,4,9,4};
		int sum=0;
		for(int i =0; i<ar.length;i++)
		{
			if (i%2==0)
			{
				sum=sum+ar[i];
			}
		}
		System.out.println(sum);
	}
}