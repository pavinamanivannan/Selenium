package loopingstatement.Forloop;


public class Fetchdigit {
	public static void main(String[] args) {
		int n = 4358;
		for(int i=n;i!=0;)
		{
			int rem =i%10;
			System.out.println(rem);
			i=i/10;
		}
	}
}
