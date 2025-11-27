package locgicalprgm;

public class NumberPalindrome {
		public static void main(String[] args) {
			int no = 151;
			int copy = no;
			int rev = 0;
			while (no!=0)
			{
				int rem = no%10;
				rev = rev*10+rem;
				no = no/10;
			}
			if (copy==rev) {
				System.out.println(copy+" Its a number Palindrome");
			}
			else
			{
				System.out.println(copy+" its not a number palindrome");
			}
		}
}
