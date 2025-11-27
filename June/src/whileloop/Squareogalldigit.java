package whileloop;

public class Squareogalldigit {
	public static void main(String[] args) {
		int n=7432;
		while(n!=0)
		{
			int rem = n%10;
			System.out.println(rem*rem);
			n=n/10;
		}
	}
}
