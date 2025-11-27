package scanner.program;

import java.util.Scanner;

public class Palindrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); 
	        System.out.print("Enter a string: ");
	        String s = sc.nextLine(); 

	        String rev = "";
	        for (int i = s.length() - 1; i >= 0; i--) {
	            char ch = s.charAt(i);
	            rev = rev + ch;
	        }

	        if (s.equals(rev)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }

	        sc.close();
	    }
	}


