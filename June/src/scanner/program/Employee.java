package scanner.program;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] edetails= {"EmpName","EmpID","EmpSal","Empdept","EmpAddress"};
		for(String s:edetails)
		{
//			if(s) {
				System.out.println(s);
				String value=scan.nextLine();
//				System.out.println(s+":"+value);
//			}
		}		
	}

}
