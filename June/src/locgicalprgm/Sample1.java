package locgicalprgm;

class Sample1
{
	public static void main(String[]args)
	{
		int a = 60;
		int b = 30;
		System.out.println("Before swapping a value is"+a);
		System.out.println("Before swapping b value is"+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping a value is"+a);
		System.out.println("After swapping b value is"+b);
	}
}