package whileloop;

public class Countofnumrt {
	static int rt()
	{
		int n=1325;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(rt());
	}
}
