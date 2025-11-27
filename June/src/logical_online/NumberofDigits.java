package logical_online;

public class NumberofDigits {
	public static void main(String[] args) {
		int num_count = 0;
		String s = "Pavina734@gmail.com";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9') {
				num_count++;
			}
		}
		System.out.println(num_count);
	}
}
