package logicalq.Array;

class Threelength
{
	public int sum3(int[] nums)
	{
		return(nums[0]+nums[1]+nums[2]);
	}
	public static void main(String[]args)
	{
		int[] ar={84,63,56};
		int a=new Threelength().sum3(ar);
		System.out.println(a);
	}
}