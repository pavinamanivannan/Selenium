package fetchcharacter;

public class FetchAllcharacter {
	public static void main(String[] args) {
		String s = "pavina743@gmail.com";
		String alpha = "";
		String digit="";
		String special="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				alpha=alpha+ch;
			}
			else if (Character.isDigit(ch)) {
				digit=digit+ch;
			} else {
				special=special+ch;
			}
		}
		System.out.println(alpha+"\n"+digit+"\n"+special);
	}
}
