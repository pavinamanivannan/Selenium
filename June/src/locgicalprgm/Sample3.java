package locgicalprgm;

class Sample3
{
	static void sam()
	{
		int a= 30;
		int b= 80;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
	public static void main(String[]args)
	{
		sam();
	}
}