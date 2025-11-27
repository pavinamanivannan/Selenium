package logicalq.If;

class Makes10
{
	public boolean makes(int a, int b)
	{
		return(a==10 || b==10 ||(a+b)==10);
	}
	public static void main(String[]args)
	{
		Makes10 m= new Makes10();
		boolean res = m.makes(10,9);
		System.out.println(res);
	}
}