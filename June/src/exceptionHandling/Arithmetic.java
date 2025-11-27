package exceptionHandling;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("Hii");
		try {
			int a =10/0;
			System.out.println(a);
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("Byee");
	}
}

