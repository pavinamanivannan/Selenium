package whileloop;

public class Countofnum {
	public static void main(String[] args) {
		int count = 0;
		int n=342904;
		while(n!=0)
		{
			count = count+1;
			n=n/10;
		}
		System.out.println(count);
	}
}
