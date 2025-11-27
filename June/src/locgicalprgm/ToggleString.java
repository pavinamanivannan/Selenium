package locgicalprgm;

public class ToggleString {
	public static void main(String[] args) {
		String s = "pAvInA";
		String change = "";
		for (int i =0; i< s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>=65 && ch<=90) {
				change=change+(char)(ch+32);
			}
			else if(ch>=97 && ch<=122)
			{
				change=change+(char)(ch-32);
			}
		}
		System.out.print(change);
	}
}
