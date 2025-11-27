package whileloop;

public class FANpara {
	static void disp(int n)
	{
		while(n!=0)
		{
			int rem = n%10;
			System.out.println(rem);
			n=n/10;
		}
	}
	public static void main(String[] args) {
		disp(874);
	}
}
