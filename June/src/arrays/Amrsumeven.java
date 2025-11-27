package arrays;

class Amrsumeven
{
	static int sum(int[] ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
			if(i%2==0)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
	public static void main(String[]args)
	{
		int[] ar ={2,63,8,5,0,4,94};
		System.out.println(sum(ar));
	}
}
