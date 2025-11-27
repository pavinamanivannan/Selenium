package locgicalprgm;

public class StringPlaindrom {
	public static void main(String[] args) {
		String s = "MOM";
		String rev = "";
		for (int i = s.length()-1; i >=0 ; i--) {
			char ch = s.charAt(i);
			rev=rev+ch;
		}
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}