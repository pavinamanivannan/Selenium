package nonStatic;

class Subject
{
	void disp()
	{
		System.out.println("Hello Pavina");
	}
		public static void main(String[]args)
	{
		new Subject().disp();
	}

}