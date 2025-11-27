package consturctor.Constuctor;

class School
{
	String student_name;
	char student_class;
	char student_grade;
	School(String a, char e, char g)
	{
		student_name=a;
		student_class=e;
		student_grade=g;
	}
	public static void main(String[]args)
	{
		School s1= new School("Pavina",'A','O');
		School s2= new School("Ruthra",'B','O');
		System.out.println(s1.student_name+" "+s1.student_class+" "+s1.student_grade);
		System.out.println(s2.student_name+" "+s2.student_class+" "+s2.student_grade);
	}
}