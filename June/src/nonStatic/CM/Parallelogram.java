package nonStatic.CM;

class Parallelogram
{
	void para()
	{
		int b = 23;
		int h = 4;
		int area = b*h;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		new Parallelogram().para();
	}
}