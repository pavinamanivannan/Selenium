package stringclasses;

public class StringMethod {
	static void length()
	{
		String s="Java";
		int n=s.length();
		System.out.println(n);
	}
	static void charAt()
	{
		String s="Java";
		char ch=s.charAt(2);
		System.out.println(ch);
	}
	static void toUpperCase()
	{
		String s="java";
		String a=s.toUpperCase();
		System.out.println(a);
	}
	static void toLowerCase()
	{
		String s="JAVA";
		String a=s.toLowerCase();
		System.out.println(a);
	}
	static void equals()
	{
		String s= "Java";
		String a="mava";
		System.out.println(s.equals(a));
	}
	static void equalsIgnoreCase()
	{
		String s="Java";
		String a="java";
		System.out.println(s.equalsIgnoreCase(a));
	}
	static void toCharArray()
	{
		String s="Java";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
	static void trim()
	{
		String s="    I'm a student    ";
		String a=s.trim();
		System.out.println(a);
	}
	static void splict()
	{
		String s="I'm a student";
		String[] a=s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		length();
		charAt();
		toUpperCase();
		toLowerCase();
		equals();
		equalsIgnoreCase();
		toCharArray();
		trim();
		splict();
	}
}
