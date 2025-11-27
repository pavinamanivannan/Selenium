package consturctor;

class School 
{
	String s_name;
	char s_grade;
	int s_strength;
	School(String s_name,char s_grade,int s_strength)
	{
		this.s_name=s_name;
		this.s_grade= s_grade;
		this.s_strength=s_strength;
	}
	public static void main(String[] args) 
	{
		School s1 = new School("Delhi public school",'A',1200);
		School s2 = new School("BMC school",'A',800);
		System.out.println(s1.s_name+" "+s1.s_grade+"  "+s1.s_strength);
		System.out.println(s2.s_name+" "+s2.s_grade+"  "+s2.s_strength);
	}
}
