package scanner.program;

import java.util.Scanner;

public class CreatePrint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = scan.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter Elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
