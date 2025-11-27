package whileloop;

public class Countofnumpara {
	static void para(int n)
	{
		int count = 0;
		while(n!=0)
		{
			count=count+1;
			n=n/10;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		para(93477);
	}
}
