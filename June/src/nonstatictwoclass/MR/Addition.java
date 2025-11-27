package nonstatictwoclass.MR;

class Add
{
	int area()
	{
		int a=9;
		int b=4;
		return a+b;
	}
}
class Addition 
{
	public static void main(String[]args)
	{
		int a=new Add().area();
		System.out.println(a);
	}
}