package logical_online;

public class NumberOfUpperLower {
	public static void main(String[] args) {
		String s = "AbcD@gmail.com";
		int upper_count=0;
		int lower_count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='A' && ch<='Z') {
				upper_count++;
			}
			if (ch>='a' && ch<='z') {
				lower_count++;
			}
		}
		System.out.println(upper_count+"\n"+lower_count);
	}
}
