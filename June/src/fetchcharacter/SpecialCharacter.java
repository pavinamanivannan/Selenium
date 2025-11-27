package fetchcharacter;

public class SpecialCharacter {
	public static void main(String[] args) {
		String s = "pavina743@gmail.com";
		String special="";
		for (int i = 0; i <s.length(); i++) {
			char ch = s.charAt(i);
			if (!(Character.isAlphabetic(ch)) && !(Character.isDigit(ch))) {
				special=special+ch;
			}
		}
		System.out.println(special);
	}
}
