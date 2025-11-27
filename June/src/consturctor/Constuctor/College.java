package consturctor.Constuctor;

class College
{
	String course_name;
	String univrs_name;
	int exam_cost;
	College(String a,String b,int c)
	{
		course_name=a;
		univrs_name=b;
		exam_cost=c;
	}
	public static void main(String[]args)
	{
		College c1=new College("BCA","ABC",6700);
		College c2=new College("BSC(MATHS)","XYZ",9700);
		System.out.println(c1.course_name+" "+c1.univrs_name+" "+c1.exam_cost);
		System.out.println(c2.course_name+" "+c2.univrs_name+" "+c2.exam_cost);
	}
}