package armStrong;

public class SumArmStrongno {
	static int countDigit(int n)
	{
		int count = 0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	static void armStrong(int n)
	{
		int count = countDigit(n);
		int sum =0;
		int copy=n;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum+(int)Math.pow(rem, count);
			n=n/10;
		}
		if (sum==copy)
		{
			System.out.println("Arm strong number");
		}
		else
		{
			System.out.println("Not arm strong number");
		}
	}
	public static void main(String[] args) {
		int n=153;
		armStrong(n);
	}
}
