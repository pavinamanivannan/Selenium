package logicalq.Array;

class Twono
{
	public boolean commonEnd(int[] a,int[] b)
	{
		return (a[0]==b[0] || a[a.length-1]==b[b.length-1]);
	}
		public static void main(String[]args)
	{
			int[] a ={2,9,8,7};
			int[] b ={3,7,4,7};
			boolean x= new Twono().commonEnd(a,b);
			System.out.println(x);
	}
}