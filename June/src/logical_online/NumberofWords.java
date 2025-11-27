package logical_online;

public class NumberofWords {
	public static void main(String[] args) {
		String s = "Java   is  a  language";
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) {
			char ch1=s.charAt(i);
			char ch2 = s.charAt(i+1);
			if (ch1==' ' && ch2!=' ') {
				count++;
			}
		}
		System.out.println(count+1);
	}
}
