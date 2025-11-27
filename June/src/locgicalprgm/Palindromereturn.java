package locgicalprgm;

public class Palindromereturn {
	public static void main(String[] args) {
		String s = "DAD";
		System.out.println(retr(s));
	}
	static Boolean retr(String s)
	{
		String rev = "";
		for (int i = s.length()-1; i >=0; i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
	}
		return s.equals(rev);
  }
}
