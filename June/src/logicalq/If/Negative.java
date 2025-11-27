package logicalq.If;

class Negative
{
	public boolean lastdigit(int a,int b)
	{
		return a%10==b%10;
	}
	public static void main(String[]args)
	{
		Negative n = new Negative();
		boolean res = n.lastdigit(5,5);
		System.out.println(res);	
	}
}