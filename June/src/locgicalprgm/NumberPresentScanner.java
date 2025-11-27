package locgicalprgm;

import java.util.Scanner;

public class NumberPresentScanner {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int size = scan.nextInt();
		System.out.println("Enter the size");
		int[] ar =new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int key=scan.nextInt();
		for (int i = 0; i < ar.length; i++) {
			if (key==ar[i]) {
				System.out.println(key+" is present at index"+i);
				return;
			}
		}
		System.out.println(key+" is not peresnt");
	}
}
