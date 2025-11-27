package logicalq.If;
class Monkey
{
	//public boolean monkeytrouble(boolean aSmile, boolean bSmile)
	public boolean monkeytrouble(String aSmile, String bSmile)
	{
		if (aSmile==bSmile)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[]args)
	{
		Monkey m=new Monkey();
		boolean a = m.monkeytrouble("smile","smile");
		System.out.println(a);
	}
}