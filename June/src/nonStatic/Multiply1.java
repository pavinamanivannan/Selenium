package nonStatic;

class Multiply1
{
	int mul()
	{
		int a=10;
		int b=78;
		int c=a*b;
		
		return c;
	}
		public static void main(String[]args)
	{
		int z= new Multiply1().mul();
		System.out.println(z);
	}
}