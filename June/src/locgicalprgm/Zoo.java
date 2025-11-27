package locgicalprgm;

import java.util.Scanner;

public class Zoo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = scan.nextLine();
		int x = 0;
		int y = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='z')
			{
				x++;
			}
			else if(ch=='o')
			{
				y++;
			}
		}
		System.out.println((2*x==y)? "Yes":"No");
	}
}
