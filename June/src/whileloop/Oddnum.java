package whileloop;

public class Oddnum {
	public static void main(String[] args) {
		int n=9743;
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			if (rem%2!=0)
			{
				sum =sum+rem;
			}
			n=n/10;
		}
		System.out.println(sum);
	}
}
