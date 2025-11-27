package common.program;

import java.util.Scanner;

public class Common {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
	}
}
