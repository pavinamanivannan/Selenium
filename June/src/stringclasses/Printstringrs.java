package stringclasses;

public class Printstringrs {
		public static void main(String[] args) {
			String s = "Java";
			int len = s.length();
			for (int i = len-1; i >=0; i--)
			{
				char ch=s.charAt(i);
				System.out.println(ch);
			}	
		}
}
