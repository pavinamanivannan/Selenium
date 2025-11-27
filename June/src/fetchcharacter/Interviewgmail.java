package fetchcharacter;

public class Interviewgmail {
	static String fetchDigits(String s)
	{
		String digit="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				digit=digit+ch;
			}
		}
		return digit;
	}
	public static void main(String[] args) {
		String s = "pavina743@gmail.com";
		String num = fetchDigits(s);
		int n = Integer.parseInt(num);
		sumOfDigits(n);
	}
	static void sumOfDigits(int n)
	{
		int sum = 0;
		while (n!=0) {
			int rem= n%10;
			sum = sum+rem;
			n=n/10;
		}
		if (sum>9) {
			sumOfDigits(sum);
		}
		else {
			System.out.println(sum);
		}
	}
}
