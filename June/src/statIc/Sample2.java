package statIc;

class Multiple
{
	static void mul()
	{
		int a=7;
		int b = 3;
		System.out.println(a*b);
	}
	
}

class Division
{
	static void div()
	{
		int a=8;
		int b=4;
		System.out.println(a/b);
	}
}

class Sample2
{
	public static void main(String[]args)
	{
		Multiple.mul();
		Division.div();
	}
}