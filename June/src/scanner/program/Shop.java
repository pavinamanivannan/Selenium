package scanner.program;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our shop");
		String[] vegetables= {"Carrot","Tomato","Potato","Onion","Brinjal"};
		int[] price= {70,30,50,60,20};
		for (String s:vegetables) {
			System.out.println(s);
		}
		System.out.println("Enter the vegetables name");
		String name=scan.nextLine();
		for (int i = 0; i < vegetables.length; i++) {
			if(vegetables[i].equalsIgnoreCase(name)) {
				System.out.println("1kg of "+vegetables[i]+" cost "+price[i]);
				Thread.sleep(2000);
				System.out.println("How many kg you want?");
				int kg =scan.nextInt();
				int total=kg*price[i];
				System.out.println(kg+"Kg "+vegetables[i]+ " costs "+total);
			}
		}
  		Thread.sleep(2000);
		System.out.println("Thank you for shopping");
		
	}
}
