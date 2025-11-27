package locgicalprgm;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "Java";
		LinkedHashSet<Character> l = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length()-1; i++) {
			char ch = s.charAt(i);
			l.add(ch);
		}
		for (Object o : l) {
			System.out.print(o);
		}
	}
}
