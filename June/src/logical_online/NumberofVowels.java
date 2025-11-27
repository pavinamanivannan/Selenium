package logical_online;

public class NumberofVowels {
	public static void main(String[] args) {
		String s="Qspider";
		int v_count=0;
		int c_count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				v_count++;
			}
			else
			{
				c_count++;
			}
		}
		System.out.println(v_count+"\n"+c_count);
	}
}
